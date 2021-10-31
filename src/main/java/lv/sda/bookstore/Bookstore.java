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
    public List<Book> searchBookByTitle(String query){

        List<Book> foundBooks = new ArrayList<>();

        for (Book book : bookshelf){
            if(book.getTitle().contains(query)){
                System.out.println(book.getTitle());
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
