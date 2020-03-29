package pl.filewicz.movieclient.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;
import pl.filewicz.movieclient.model.Status;
import pl.filewicz.movieclient.model.StatusDto;

@Mapper
@DecoratedWith(MovieMapperDecorator.class)
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    MovieDto movieToMovieDto(Movie movie);


}