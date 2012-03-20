package mspace.domain.db;

import mspace.domain.Book;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

public class BookRepository {

    private SessionFactory sessionFactory;

    public BookRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public BookRepository(){

    }

    @Transactional
    public Book create(Book book){
        String id = (String)this.sessionFactory.getCurrentSession().save(book);
        return (Book) this.sessionFactory.getCurrentSession().load(Book.class, id);
    }

    @Transactional(readOnly = true)
    public Book get(String isbn) {
        return (Book) this.sessionFactory.getCurrentSession().createCriteria(Book.class).add(Restrictions.eq("isbn", isbn)).uniqueResult();
    }
}
