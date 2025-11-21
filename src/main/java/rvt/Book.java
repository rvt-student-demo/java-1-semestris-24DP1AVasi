package rvt;

public class Book {
    public String title;
    public String author;
    public int pages;
    public int year;
    
    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear() {
        return this.year;
    }
}
