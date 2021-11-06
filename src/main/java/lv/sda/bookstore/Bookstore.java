package lv.sda.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Bookstore {
    private List<Book> bookshelf = new ArrayList<>();

    public void addBook(Book newBook) {
        for (Book book : bookshelf) {
            if (book.getIsbn().equals(newBook.getIsbn())) {
                System.out.println("Book already exists in the database.");
                return;
            }
        }
        bookshelf.add(newBook);
    }

    public boolean removeBook(String isbn) {
        return bookshelf.removeIf(book -> book.getIsbn().equals(isbn));

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
            if(book.getTitle().toLowerCase().contains(query)){
                System.out.println(book.getTitle());
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    public void searchByTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter book`s title");
        String query = scan.nextLine();
        List<Book> books = searchBookByTitle(query.toLowerCase());
        if(books.isEmpty()){
            System.out.println("No books found.");
        }
    }

    public void removeBookByISBN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN of a book you want to remove:");
        String query = scanner.nextLine();
        boolean removed = removeBook(query);
        if(removed){
            System.out.println("Book has been removed!");
        }else{
            System.out.println("Book not found");
        }
    }
}

