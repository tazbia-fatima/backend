package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createBook() {

        Book book = new Book(1,"Tazz");

        assertTrue(book.getID() == 1);
       assertEquals("Tazz", book.getTitle());

    } }
