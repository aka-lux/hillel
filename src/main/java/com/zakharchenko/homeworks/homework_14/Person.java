package com.zakharchenko.homeworks.homework_14;

import lombok.Value;

@Value
public class Person {
    String name;
    String surname;
    int age;
    int height;
    int weight;
    String email;

    public String getEmailDomain(){
        return this.email.split("@")[1];
    }
}
