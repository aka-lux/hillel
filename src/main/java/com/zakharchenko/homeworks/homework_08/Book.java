package com.zakharchenko.homeworks.homework_08;

import lombok.Value;

import java.text.SimpleDateFormat;
import java.util.Date;

@Value
public class Book {

    Author author;
    Date issueDate;
    Genre genre;
    Long isbn;

    public Date getIssueDate() {
        return new Date(this.issueDate.getTime());
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return "Book{" +
                "author=" + author +
                ", issueDate=" + sdf.format(issueDate) +
                ", genre=" + genre +
                ", isbn=" + isbn +
                '}';
    }
}
