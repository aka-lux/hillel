package com.zakharchenko.homeworks.homework_08;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Book {

   private Author author;
   private Date issueDate;
   private Genre genre;
   private Long isbn;

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = issueDate;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getIssueDate() {
        return new Date(this.issueDate.getTime());
    }

    public Genre getGenre() {
        return genre;
    }

    public Long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (issueDate != null ? !issueDate.equals(book.issueDate) : book.issueDate != null) return false;
        if (genre != book.genre) return false;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (issueDate != null ? issueDate.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
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
