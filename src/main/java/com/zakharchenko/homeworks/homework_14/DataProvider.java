package com.zakharchenko.homeworks.homework_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    DataMapper dataMapper = new DataMapper();

     public ArrayList<Person> provide(String filename) {
        ArrayList<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            for (String line; (line = br.readLine()) != null; ) {
                persons.add(dataMapper.map(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

}
