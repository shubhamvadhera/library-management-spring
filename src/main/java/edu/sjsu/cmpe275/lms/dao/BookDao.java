package edu.sjsu.cmpe275.lms.dao;

/**
 * Created by Sagar on 12/2/2016.
 */
import edu.sjsu.cmpe275.lms.entity.Book;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookDao {

    /**
     * Add a book to database
     * @param book
     * @return true if add successful, false if failed
     */
    boolean addBook(Book book);

    /**
     * Add a book to database
     *
     * @param isbn                10 or 13 digit ISBN code, must be uniqur
     * @param author              Author of the book
     * @param title               Title of the book, must be unique
     * @param callnumber          Call Number
     * @param publisher           Publisher of the book
     * @param year_of_publication Year of publication
     * @param location            Location of the book in library
     * @param num_of_copies       Number of copies
     * @param current_status      Current Status
     * @param keywords            Keywords
     * @param image               Bytes as image
     * @return true if add successful, false if failed
     */
    boolean addBook(String isbn, String author, String title, String callnumber, String publisher, int year_of_publication, String location, int num_of_copies, String current_status, String keywords);

    /**
     * Return the book by isbn code
     * @param isbn
     * @return book object
     */
    Book getBookByISBN (String isbn);
}