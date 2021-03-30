package com.zakharchenko.homeworks.homework_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BinaryOperator;

public class CovidStat {
    private ArrayList<Person> person;

    public CovidStat(ArrayList<Person> person) {
        this.person = person;
    }

    private Person getMostPopular(){
        return person.stream()
                .reduce(BinaryOperator.maxBy((o1, o2) -> Collections.frequency(person, o1) -
                        Collections.frequency(person, o2))).orElse(null);
    }

    public String getMostPopularName() {
        return getMostPopular().getName();
    }

    public String getMostPopularSurname() {
        return getMostPopular().getSurname();
    }

    public String getMostPopularMailDomain() {
        return  getMostPopular().getEmailDomain();
    }

    public Double getAverageAge() {
       return person.stream().mapToInt(Person::getAge).average().getAsDouble();
    }

    public Double getAverageHeight() {
        return person.stream().mapToInt(Person::getHeight).average().getAsDouble();
    }

    public Double getAverageWeight() {
        return person.stream().mapToInt(Person::getWeight).average().getAsDouble();
    }

}
