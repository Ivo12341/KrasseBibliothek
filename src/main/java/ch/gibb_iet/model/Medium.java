package main.java.ch.gibb_iet.model;

import java.util.Date;

public abstract class Medium {
    private String title;
    private Person author;
    private Date releaseDate;

    public Medium(String title, Person author, Date releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Medium{" +
                "title='" + title + '\'' +
                ", author=" + author.getFirstname() + " " + author.getLastname() +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
