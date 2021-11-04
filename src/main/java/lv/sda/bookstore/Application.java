package lv.sda.bookstore;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore();

        bookstore.addBook(new Book("Project Hail Mary", "Andy Weir", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593135204"));
        bookstore.addBook(new Book("Klara and the Sun", "Kazuo Ishiguro", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593318171"));
        bookstore.addBook(new Book("Effortless", "Greg McKeown", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593135648"));
        bookstore.addBook(new Book("Gold Diggers", "Sanjena Sathian", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781984882035"));
        bookstore.addBook(new Book("Luck of the Titanic", "Stacey Lee", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781524740986 "));
        bookstore.addBook(new Book("Before She Disappeared", "Lisa Gardner", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781524745073"));
        bookstore.addBook(new Book("Four Hundred Souls", "Ibram X. Kendi and Keisha N. Blain", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780593134047"));
        bookstore.addBook(new Book("People We Meet on Vacation", "Emily Henry", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781984806758"));
        bookstore.addBook(new Book("Crying in H Mart", "Michelle Zauner", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9780525657743"));
        bookstore.addBook(new Book("Malibu Rising", "Taylor Jenkins Reid", LocalDate.of(2021, 1,1), 320, "New York times bestseller", "Ballantine Books", "9781524798659"));

       while (true){
           System.out.println("Bookstore menu");
           System.out.println("1. Search a book");
           System.out.println("2. Add a book");
           System.out.println("3. Remove a book");
           System.out.println("4. Book list");
           System.out.println("To quit press q");
           String input = scanner.next();
           if(input.equals("q")) {
               System.out.println("Quitting application");
               break;
           }


           switch (input){
               case "1":
                   System.out.println("Search a book by the title");
                   bookstore.searchByTitle();
                   break;
               case "2":
                   System.out.println("Add a book");
                   Book book = addBook();
                   bookstore.addBook(book);
                   break;
               case "3":
                   System.out.println("Remove a book");
                   bookstore.removeBookByISBN();
                   System.out.println("Book has been removed!");
                   break;
               case "4":
                   System.out.println("List of books:");
                   bookstore.getBookshelf().forEach(System.out::println);
                   break;
               default:
                   System.out.println("Wrong input, please try again!");
           }
       }
    }

    public static Book addBook(){
        Book book = new Book();
        scanner.nextLine();
        System.out.println("Enter title");
        book.setTitle(scanner.nextLine());
        System.out.println("Enter author");
        book.setAuthor(scanner.nextLine());
        System.out.println("Enter publishing year");
        Integer year = Integer.valueOf(scanner.nextLine());
        LocalDate publishingYear = LocalDate.of(year,1,1);
        book.setPublishingYear(publishingYear);
        System.out.println("Enter number of pages");
        book.setPages(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter the publisher");
        book.setPublisher(scanner.nextLine());
        System.out.println("Enter description of the book");
        book.setDescription(scanner.nextLine());
        System.out.println("Enter Isbn");
        book.setIsbn(scanner.nextLine());
        return book;
    }
}
