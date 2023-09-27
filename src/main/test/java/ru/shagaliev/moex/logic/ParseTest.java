package ru.shagaliev.moex.logic;

import junit.framework.TestCase;
import org.junit.Test;
import ru.shagaliev.moex.logic.data.*;
import ru.shagaliev.moex.models.Moex;

import java.util.List;

public class ParseTest extends TestCase {

    @Test
    public void testParseNumberOfShares() {
        Parse parse=new Parse();
        List<NumberOfShares> numberOfShares = parse.parseNumberOfShares();
        assertNotNull(numberOfShares);
    }

    @Test
    public void testParsePrice() {
        Parse parse=new Parse();
        List<Price> price = parse.parsePrice();
        assertNotNull(price);
    }

    @Test
    public void testParseCapital() {
        Parse parse=new Parse();
        List<Capital> capitals = parse.parseCapital();
        assertNotNull(capitals);
    }
    @Test
    public void testParseEps() {
        Parse parse=new Parse();
        List<Eps> eps = parse.parseEps();
        assertNotNull(eps);
    }
    @Test
    public void testParseCleanIncome() {
        Parse parse=new Parse();
        List<CleanIncome> cleanIncome = parse.parseCleanIncome();
        assertNotNull(cleanIncome);
    }
    @Test
    public void testParseOperatingIncome() {
        Parse parse=new Parse();
        List<OperatingIncome> operatingIncome = parse.parseOperatingIncome();
        assertNotNull(operatingIncome);
    }
    @Test
    public void testParseRoe() {
        Parse parse=new Parse();
        List<RoePercent> roePercent = parse.parseRoe();
        assertNotNull(roePercent);
    }
    @Test
    public void testMoexBuild() {
        MoexBuild moexBuild=new MoexBuild(new Parse());
        List<Moex> moexList = moexBuild.build();
        assertNotNull(moexList);
    }
}