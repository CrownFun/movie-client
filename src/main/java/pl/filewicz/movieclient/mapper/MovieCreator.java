package pl.filewicz.movieclient.mapper;

import lombok.RequiredArgsConstructor;
import pl.filewicz.movieclient.client.ActorClient;
import pl.filewicz.movieclient.model.Actor;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;

@RequiredArgsConstructor
public class MovieCreator {

private final ActorClient actorClient;


public MovieDto cretaeMovieDto(Movie movie){

    MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto(movie);
    setActorToMovie(movieDto);
    return movieDto;
}

    private void setActorToMovie(MovieDto movieDto) {
        Actor actor = actorClient.getActor(movieDto.getTitle());
        movieDto.setActor(actor);
    }


}
