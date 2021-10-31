package lv.sda.bookstore;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book {
    private String title;
    private String author;
    private LocalDate publishingYear;
    private int pages;
    private String description;
    private String publisher;
    private String isbn;

    public Book(String title, String author, LocalDate publishingYear,
                int pages, String description, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.description = description;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", pages=" + pages +
                ", description='" + description + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}