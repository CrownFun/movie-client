package pl.filewicz.movieclient.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.filewicz.movieclient.model.Movie;
import pl.filewicz.movieclient.model.MovieDto;

@Mapper
public interface MovieMapper {

MovieMapper  INSTANCE = Mappers.getMapper(MovieMapper.class);


MovieDto movieToMovieDto(Movie movie);

}
