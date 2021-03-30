package com.zakharchenko.homeworks.homework_14;


public class DataMapper {

    public Person map(String s) {

        try {
            String[] splited = s.split(",");
            return new Person(splited[0],
                    splited[1],
                    Integer.parseInt(splited[2]),
                    Integer.parseInt(splited[3]),
                    Integer.parseInt(splited[4]),
                    splited[5]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
