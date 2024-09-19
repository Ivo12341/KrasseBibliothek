package main.java.ch.gibb_iet.model;

import java.util.Date;

public class Person {
    private String firstname;
    private String lastname;
    private Date birthyear;

    public Person(String firstname, String lastname, Date birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Date birthyear) {
        this.birthyear = birthyear;
    }
}
