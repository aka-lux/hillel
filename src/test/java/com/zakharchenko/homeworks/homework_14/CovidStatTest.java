package com.zakharchenko.homeworks.homework_14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CovidStatTest {

    @Test
    public void ReadData(){
        DataProvider dataProvider = new DataProvider();
        DataMapper dataMapper = new DataMapper();
        CovidStat covidStat = new CovidStat(dataProvider.provide("src/main/resources/covidStat.csv"));
        assertEquals("Person(name=Eugene, surname=Berezhnyi, age=32, height=170, weight=81, email=berezhnoy87@gmail.com)",
                dataMapper.map("Eugene,Berezhnyi,32,170,81,berezhnoy87@gmail.com").toString());
        assertEquals("Volodymyr",covidStat.getMostPopularName());
        assertEquals("Zelensky",covidStat.getMostPopularSurname());
        assertEquals("ukr.com",covidStat.getMostPopularMailDomain());
        assertEquals(40.4,covidStat.getAverageAge());
        assertEquals(76.2,covidStat.getAverageWeight());
        assertEquals(162.3,covidStat.getAverageHeight());

    }

}
