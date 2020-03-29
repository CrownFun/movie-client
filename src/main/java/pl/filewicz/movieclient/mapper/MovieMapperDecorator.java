package pl.filewicz.movieclient.mapper;

import org.mapstruct.Named;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;
import pl.filewicz.movieclient.model.Status;
import pl.filewicz.movieclient.model.StatusDto;


public abstract class MovieMapperDecorator implements MovieMapper{


    private final MovieMapper delegate;

    public MovieMapperDecorator(MovieMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public MovieDto movieToMovieDto(Movie movie) {
        MovieDto movieDto = delegate.movieToMovieDto(movie);
        movieDto.setStatus(statusConvert(movie.getStatus()));
        return movieDto;
    }

    private static StatusDto statusConvert(Status status) {

        StatusDto statusDto = null;

        switch (status) {
            case DO_OBEJRZENIA:
                statusDto = StatusDto.DO_OBEJRZENIA;
                break;
            case OBEJRZANY:
                statusDto = StatusDto.OBEJRZANY;
                break;
            case BARDZO_DOBRY:
                statusDto = StatusDto.BARDZO_DOBRY;
                break;
            case HUJOWY:
                statusDto = StatusDto.HUJOWY;
                break;
            case PZRED_PREMIERA:
                statusDto = StatusDto.HUJOWY;
                break;
            default:
                statusDto = StatusDto.HUJOWY;

        }
        return statusDto;
    }
}
