package com.example.aditi.easyrecycler;

/**
 * Created by aditi on 15/3/18.
 */

public class Movie {

 private String title, Genre, Year;

  public Movie(String title, String Genre, String Year){
      this.title = title;
      this.Genre = Genre;
      this.Year = Year;

  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
