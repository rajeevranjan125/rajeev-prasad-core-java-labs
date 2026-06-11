package com.rajeev.lab4.exe3;

class Item {
    private int id;
    private String title;
    private int copies;

    public Item(int id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean equals(Item obj) {
        return this.id == obj.id;
    }

    public String toString() {
        return id + " " + title + " " + copies;
    }

    public void checkIn(int qty) {
        copies += qty;
    }

    public boolean checkOut(int qty) {
        if (copies >= qty) {
            copies -= qty;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(toString());
    }
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return super.toString() + " " + author;
    }
}

class Book extends WrittenItem {
    public Book(int id, String title, int copies, String author) {
        super(id, title, copies, author);
    }

    public String toString() {
        return super.toString();
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return super.toString() + " " + yearPublished;
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public String toString() {
        return super.toString() + " " + runtime;
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String toString() {
        return super.toString() + " " + director + " " + genre + " " + yearReleased;
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String toString() {
        return super.toString() + " " + artist + " " + genre;
    }
}

public class LibraryApp {
    public static void main(String[] args) {

        Book b = new Book(1, "Java", 5, "James");
        JournalPaper j = new JournalPaper(2, "AI Research", 3, "Smith", 2023);
        Video v = new Video(3, "Inception", 2, 150, "Nolan", "SciFi", 2010);
        CD c = new CD(4, "Hits", 10, 60, "ArtistX", "Pop");

        b.print();
        j.print();
        v.print();
        c.print();

        b.checkOut(2);
        b.checkIn(1);

        System.out.println("After update:");
        b.print();
    }
}