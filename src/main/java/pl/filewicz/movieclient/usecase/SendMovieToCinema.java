package pl.filewicz.movieclient.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.filewicz.movieclient.client.MovieClient;
import pl.filewicz.movieclient.mapper.MovieMapper;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;

@Service
@RequiredArgsConstructor
public class SendMovieToCinema {

    private MovieClient movieClient;

    public void execute(String title){

        //pobieranie
        Movie movie = movieClient.getMovieByTitle(title);


        //mapowanie
        MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto(movie);

        //dociaganie


        //wysylka

        //zmianastatustu


        //zapis do bazy


        //pokaz wynik

    }

}
