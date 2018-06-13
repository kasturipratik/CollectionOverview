package com.company;

public class Collection {

    private String movie;
    private String books;

    public Collection(String movie, String books){
        this.movie = movie;
        this.books = books;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }
}
