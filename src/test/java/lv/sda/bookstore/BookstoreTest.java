package lv.sda.bookstore;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookstoreTest {

    @Test
    public void testBookWasAddedToBookshelf() {
        Bookstore bookstore = new Bookstore();

        assertEquals(0, bookstore.getBookshelf().size());

        Book book = new Book("Bada Speles", "Suzanna", LocalDate.of(1999, 4, 1), 320, "adc", "drama", "7890");
        bookstore.addBook(book);

        assertEquals(1, bookstore.getBookshelf().size());
    }

    @Test
    public void testBookWasRemovedToBookshelf() {
        Bookstore bookstore = new Bookstore();

        Book book = new Book("Bada Speles", "Suzanna", LocalDate.of(1999, 4, 1), 320, "adc", "drama", "7890");
        bookstore.addBook(book);

        assertEquals(1, bookstore.getBookshelf().size());

        bookstore.removeBook("7890");

        assertEquals(0, bookstore.getBookshelf().size());
    }
    @Test
    public void testSearchForABookByTitle(){
        Bookstore bookstore = new Bookstore();

        bookstore.addBook(new Book("Project Hail Mary", "Andy Weir", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593135204"));
        bookstore.addBook(new Book("Klara and the Sun", "Kazuo Ishiguro", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593318171"));
        bookstore.addBook(new Book("Effortless", "Greg McKeown", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593135648"));
        bookstore.addBook(new Book("Gold Diggers", "Sanjena Sathian", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781984882035"));

        List<Book> foundBooks = bookstore.searchBookByTitle("Gold");

        assertEquals(1, foundBooks.size());
    }

}