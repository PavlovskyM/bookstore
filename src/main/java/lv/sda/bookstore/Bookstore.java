package lv.sda.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> bookshelf = new ArrayList<>();

    public void addBook(Book book){
        bookshelf.add(book);
    }

    public void removeBook(String isbn) {
        bookshelf.removeIf(book -> book.getIsbn().equals(isbn));
    }
    public void listBooks(){
        bookshelf.forEach(System.out::println);
    }
    public List<Book> getBookshelf(){
        return bookshelf;
    }
}
