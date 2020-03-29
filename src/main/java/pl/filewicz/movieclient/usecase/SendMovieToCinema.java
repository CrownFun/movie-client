package pl.filewicz.movieclient.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.filewicz.movieclient.client.MovieClient;
import pl.filewicz.movieclient.mapper.MovieCreator;
import pl.filewicz.movieclient.mapper.MovieMapper;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;

@Service
@RequiredArgsConstructor
public class SendMovieToCinema {

    private MovieClient movieClient;
    private MovieCreator movieCreator;


    public void execute(String title) {

        //pobieranie
        Movie movie = movieClient.getMovieByTitle(title);


        //mapowanie i dociaganie
        movieCreator.cretaeMovieDto(movie);



/**
 //wysylka

 trzeba w rest pai napisac metose ktora postem przesyła sie movieDto , cos tam werifkuje, i zwraca odpwoiedz np 422

 **/

//zmianastatustu


        //zapis do bazy



        //pokaz wynik

    }

}
