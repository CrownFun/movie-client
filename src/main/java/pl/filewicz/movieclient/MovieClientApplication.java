package pl.filewicz.movieclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.filewicz.movieclient.client.MovieClient;
import pl.filewicz.movieclient.mapper.MovieMapper;
import pl.filewicz.movieclient.model.*;

@SpringBootApplication
public class MovieClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MovieClientApplication.class, args);

        Movie movie = new Movie("Home Alone",1994,"Chris Columbus",7.6, Genre.ACTION,3424, Status.BARDZO_DOBRY);


        MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto(movie);

        System.out.println("title " + movieDto.getTitle());
        System.out.println(movieDto);


//        MovieClient bean = run.getBean(MovieClient.class);
//        Movie predator = bean.getMovieByTitle("Predator");
//        System.out.println(predator);
//        MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto(predator);
//        System.out.println(movieDto);
    }

}
