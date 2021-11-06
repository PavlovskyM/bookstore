package lv.sda.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookstore {
    private List<Book> bookshelf = new ArrayList<>();

    public void addBook(Book book){
        bookshelf.add(book);
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
            if(book.getTitle().contains(query)){
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
        searchBookByTitle(query);
    }

    public void removeBookByISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN of a book you want to remove:");
        String query = scanner.nextLine();
        boolean removed = removeBook(query); // query (lietotāja ievade)-> removeBook (metodei) -> removed (true/false atkarībā vai grāmata tika izdzēsta)
        if(removed) {
            System.out.println("Book has been removed!");
        }else{
            System.out.println("Book has not been removed!");
        }

    }

}

