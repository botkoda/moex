package ru.shagaliev.moex.dao;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.shagaliev.moex.logic.MoexBuild;
import ru.shagaliev.moex.models.Moex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
@Getter
@Setter
public class MoexDao {
    private List<Moex> moexList;
    private final MoexBuild moexBuild;


    public MoexDao(MoexBuild moexBuild) {
        this.moexBuild = moexBuild;
        moexList = moexBuild.build();
    }

    public List<Moex> index(){
        moexList.sort(Comparator.comparing(Moex::getPoints5).reversed());
        return moexList;
    }

    public Moex show(String ticket){
        return moexList.stream().filter(x->x.getTicket().equals(ticket)).findAny().orElse(null);
    }
}
