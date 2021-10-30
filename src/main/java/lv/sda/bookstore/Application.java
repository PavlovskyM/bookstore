package lv.sda.bookstore;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

       while (true){
           System.out.println("Bookstore menu");
           System.out.println("1. Search a book");
           System.out.println("2. Add a book");
           System.out.println("3. Remove a book");
           System.out.println("To quit press q");
           String input = scanner.next();
           if(input.equals("q")) {
               System.out.println("Quitting application");
               break;
           }
           switch (input){
               case "1":
                   System.out.println("Searching for a book");
                   break;
               case "2":
                   System.out.println("Adding a book");
                   bookstore.addBook(new Book("Hunger games", "Susan",
                           LocalDate.of(1999, 1, 1),420, "very good", "ABC", "5790816153678"));
                   bookstore.listBooks();
                   break;
               case "3":
                   System.out.println("Removing a book");
                   break;
               default:
                   System.out.println("Wrong input, please try again!");
           }
       }
    }
}
