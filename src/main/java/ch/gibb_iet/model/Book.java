package main.java.ch.gibb_iet.model;

import java.util.Date;

public class Book extends Medium{
    private int pages;
    private Person illustrator;

    public int getPages() {
        return pages;
    }

    public Person getIllustrator() {
        return illustrator;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setIllustrator(Person illustrator) {
        this.illustrator = illustrator;
    }

    public Book(String title, Person author, Date releaseDate, int pages, Person illustrator) {
        super(title, author, releaseDate);
        this.pages = pages;
        this.illustrator = illustrator;
    }
}
