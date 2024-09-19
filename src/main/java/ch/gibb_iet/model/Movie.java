package main.java.ch.gibb_iet.model;

import java.util.Date;

public class Movie extends Medium{
    private Person director;
    private int duration;

    public Movie(String title, Person author, Date releaseDate, Person director, int duration) {
        super(title, author, releaseDate);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Movie{" +
                "title='" + getTitle() + '\'' +
                ", author=" + getAuthor().getFirstname() + " " + getAuthor().getLastname() +
                ", releaseDate=" + getReleaseDate() +
                ", director=" + director.getFirstname() + " " + director.getLastname() +
                ", duration=" + duration +
                '}';
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
