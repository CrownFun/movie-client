package pl.filewicz.movieclient.client;

import pl.filewicz.movieclient.model.Movie;

import java.util.List;


public interface MovieApi {

    List<Movie> getAllMovies();

    Movie getMovieByTitle(String title);

    void saveMovie(Movie movie);


}
