package com.zakharchenko.homeworks.homework_08;

import lombok.Value;

import java.text.SimpleDateFormat;
import java.util.Date;

@Value
public class Author {

    String firstName;
    String lastName;
    Date dateOfBirth;

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return firstName + " " +
                lastName + " " +
                sdf.format(dateOfBirth);
    }

}
