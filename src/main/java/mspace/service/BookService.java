package mspace.service;


import mspace.domain.Book;
import mspace.domain.db.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book createBook(String isbn, String name) {
        return bookRepository.create(new Book(isbn, name));
    }

    public Book getBookByISBN(String isbn) {
        return bookRepository.get(isbn);
    }
}
