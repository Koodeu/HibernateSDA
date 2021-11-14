package service;

import dao.BookDao;
import dto.AuthorDTO;
import dto.BookDTO;
import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    BookDao bookDao = new BookDao();

    public List<BookDTO> findBooks() {
        List<Book> books = bookDao.findBooks();
        List<BookDTO> dtos = new ArrayList<>();
        books.forEach(book -> {
            BookDTO bookDTO = new BookDTO();
            bookDTO.setTitle(bookDTO.getTitle());
            bookDTO.setPublisherName(book.getPublisher().getName());
            bookDTO.setCategoryName(book.getCategory().getName());
            bookDTO.setPagesNumber(book.getPagesNumber());
            dtos.add(bookDTO);
        });
        return dtos;
    }

    public BookDTO findByTitle(String bookTitle) {
        if (bookTitle != null && bookTitle.equals("") == false) {
            Book book = bookDao.findByTitle(bookTitle);
            BookDTO bookDTO = new BookDTO();
            bookDTO.setTitle(bookDTO.getTitle());
            bookDTO.setPublisherName(book.getPublisher().getName());
            bookDTO.setCategoryName(book.getCategory().getName());
            bookDTO.setPagesNumber(book.getPagesNumber());
            return bookDTO;
        } else {

            throw new IllegalArgumentException("bookTitle cannot be null or empty");
        }
    }

    public List<BookDTO> findBooksWithPagesNumberRange(short min, short max){

        if(min > 0 && max > 0 && max > min){
            List<Book> books = bookDao.findBookWithPagesNumberRange(min,max);
            List<BookDTO> bookDTOS = new ArrayList<>();
            books.forEach(book -> {
                BookDTO bookDTO = new BookDTO();
                bookDTO.setTitle(book.getTitle());
                AuthorDTO authorDTO = new AuthorDTO();
                authorDTO.setFirstName(book.getAuthorBookList().get(0).getAuthor().getFirstName());
                authorDTO.setFirstName(book.getAuthorBookList().get(0).getAuthor().getLastName());
                bookDTO.setAuthorDto(authorDTO);
                bookDTOS.add(bookDTO);
            });
            return bookDTOS;
        }else{
            throw new IllegalArgumentException("min and max cannot be 0 and max must be greater than min");
        }

    }

}



