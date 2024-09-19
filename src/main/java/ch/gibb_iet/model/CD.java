package main.java.ch.gibb_iet.model;

import java.util.Date;
import java.util.List;

public class CD extends Medium {
    private Person artist;
    private List<Track> tracks;

    public CD(String title, Person author, Date releaseDate, Person artist, List<Track> tracks) {
        super(title, author, releaseDate);
        this.artist = artist;
        this.tracks = tracks;
    }

    public Person getArtist() {
        return artist;
    }

    public void setArtist(Person artist) {
        this.artist = artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
