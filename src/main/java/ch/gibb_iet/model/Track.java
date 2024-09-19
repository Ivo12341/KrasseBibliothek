package main.java.ch.gibb_iet.model;

import java.util.List;

public class Track {
    private String name;
    private int duration;
    private List<Person> features;

    public Track(String name, int duration, List<Person> features) {
        this.name = name;
        this.duration = duration;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Person> getFeatures() {
        return features;
    }

    public void setFeatures(List<Person> features) {
        this.features = features;
    }
}
