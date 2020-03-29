package pl.filewicz.movieclient.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.filewicz.movieclient.model.Movie;

import java.util.List;

@RestController
@RequestMapping("/client/movies")

public class MovieClient {


    private  RestTemplate restTemplate;

    @Autowired
    public MovieClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String API_URL = "http://localhost:8081/api/movies/";


    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        System.out.println("metoda z klienta");
        ResponseEntity<List<Movie>> exchange = restTemplate.exchange(API_URL + "all", HttpMethod.GET, null, new ParameterizedTypeReference<List<Movie>>() {
        });
        List<Movie> body = exchange.getBody();
        return body;
    }

    @GetMapping("/{title}")
    public Movie getMovieByTitle(@PathVariable("title") String title) {
        ResponseEntity<Movie> responseEntity = restTemplate.exchange(API_URL + title, HttpMethod.GET, null, new ParameterizedTypeReference<Movie>() {
        });
        return responseEntity.getBody();

    }

}
