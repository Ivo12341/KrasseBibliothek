package main.java.ch.gibb_iet.model;

import java.util.List;

public class Library {
    private List<Medium> mediums;

    public void addMedium(Medium medium) {
        mediums.add(medium);
    }

    public void removeMedium(Medium medium) {
        mediums.remove(medium);
    }

    public List<Medium> getMedias() {
        return mediums;
    }

    public void setMedias(List<Medium> mediums) {
        this.mediums = mediums;
    }
}
