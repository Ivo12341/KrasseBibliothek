package main.java.ch.gibb_iet;

import main.java.ch.gibb_iet.model.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Sample Code
        Movie harryPotter = new Movie("Harry Potter und der Stein der Weisen", new Person("Joanne","K. Rowling", new Date(1958, Calendar.SEPTEMBER, 10)), new Date(2001, Calendar.NOVEMBER, 22), new Person("Joanne","K. Rowling", new Date(1958, Calendar.SEPTEMBER, 10)), 152);
        System.out.println(harryPotter);
    }
}
