package pl.filewicz.movieclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {

    private long id;
    private String title;
    private int year;
    private String director;
    private double rate;
    private Genre genre;
    private long boxoffice;
    private Status status;



    public Movie(String title, int year, String director, double rate, Genre genre, long boxoffice, Status status) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.genre = genre;
        this.boxoffice = boxoffice;
        this.status = status;
    }


}
