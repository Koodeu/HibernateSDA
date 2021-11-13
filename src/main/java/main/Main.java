package main;

import entity.Author;
import entity.Book;
import entity.Category;
import entity.Publisher;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Category category = entityManager.find(Category.class, 1);
//        System.out.println(category);

//        Book book = entityManager.find(Book.class, 1);
//        System.out.println(book);

//        System.out.println(entityManager.find(Publisher.class, 1));

//        System.out.println(entityManager.find(Author.class, 1));



    }
}
