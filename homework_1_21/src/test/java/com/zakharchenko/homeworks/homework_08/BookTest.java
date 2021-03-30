package com.zakharchenko.homeworks.homework_08;

import org.junit.jupiter.api.*;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void testGenre() {
        assertEquals(Genre.ADVENTURE.toString(), "Adventure");
        assertEquals(Genre.TRAVEL.toString(), "Travel");

        assertEquals(Genre.ADVENTURE.getValue(), "Adventure");
        assertEquals(Genre.TRAVEL.getValue(), "Travel");
    }

    @Test
    public void testAuthor() {
        Author author1 = new Author("Stephen","King", new Date(1995, 1, 4));
        Author author2 = new Author("William","Shakespeare", new Date(1995, 2, 6));

        assertEquals(author1.getFirstName(),"Stephen");
        assertEquals(author1.getLastName(),"King");
        assertEquals(author1.getDateOfBirth(),new Date(1995, 1, 4));
        assertEquals(author1.toString(),"Stephen King 02/04/3895");

        assertTrue(author1.equals(new Author("Stephen","King", new Date(1995, 1, 4))));
        assertFalse(author1.equals(author2));
    }

    @Test
    public void testBook() {
        Author stephenKing = new Author("Stephen","King", new Date(1995, 1, 4));
        Author williamShakespeare = new Author("William","Shakespeare", new Date(1995, 2, 6));

        Date date1 = new Date(1995, 10,10);
        Date date2 = new Date(1995, 10,10);

        Book book1 = new Book(stephenKing,date1,Genre.ADVENTURE,8175257660L);
        Book book2 = new Book(williamShakespeare,date2,Genre.HISTORY,8175257660L);

        assertEquals(book1.getAuthor(),stephenKing);
        assertEquals(book1.getGenre(),Genre.ADVENTURE);
        assertEquals(book1.getIssueDate(),date1);
        assertEquals(book1.getIsbn(),8175257660L);
        assertEquals(book1.toString(),"Book{author=Stephen King 02/04/3895, issueDate=11/10/3895, genre=Adventure, isbn=8175257660}");

        assertTrue(book1.equals(new Book(stephenKing,date1,Genre.ADVENTURE,8175257660L)));
        assertFalse(book1.equals(book2));

    }

}
