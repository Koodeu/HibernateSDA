package main;

import dao.BookDao;
import dto.BookDTO;
import entity.Author;
import entity.Book;
import entity.Category;
import entity.Publisher;
import service.BookService;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        BookService bookService = new BookService();

        List<BookDTO>  bookWithPagesNumberRange = bookService.findBooksWithPagesNumberRange((short) 100, (short) 300);
        bookWithPagesNumberRange.forEach(bookDTO -> {
            System.out.println(bookDTO);
        });

//        List<BookDTO> books = bookService.findBooks();
//        books.forEach(bookDTO -> System.out.println(bookDTO));

        //System.out.println(bookService.findByTitle("Kaznodzieja"));


        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Category category = entityManager.find(Category.class, 1);
        System.out.println(category);

        Book book = entityManager.find(Book.class, 1);
        System.out.println(book);

        System.out.println(entityManager.find(Publisher.class, 1));

        System.out.*//*println(entityManager.find(Author.class, 1));*/



    }
}
