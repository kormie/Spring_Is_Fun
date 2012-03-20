package mspace.service;

import mspace.BaseContextSensitiveTest;
import mspace.domain.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookServiceTest extends BaseContextSensitiveTest {

    @Test
    public void shouldCreateBook() {
        BookService bookService = classPathXmlApplicationContext.getBean(BookService.class);
        assertEquals(new Book("1234", "Spring in Action"), bookService.createBook("1234", "Spring in Action"));
    }

    @Test
    public void shouldGetBook(){
        BookService bookService = classPathXmlApplicationContext.getBean(BookService.class);
        bookService.createBook("1234", "Spring in Action");
        assertEquals(new Book("1234", "Spring in Action"), bookService.getBookByISBN("1234"));
    }

}
