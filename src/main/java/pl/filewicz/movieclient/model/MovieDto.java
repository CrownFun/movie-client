package pl.filewicz.movieclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieDto {

    private String title;
    private int year;
    private String director;
    private double rate;
    private Genre genre;
    private Status status;


}
