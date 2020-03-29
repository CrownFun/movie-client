package pl.filewicz.movieclient.client;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.filewicz.movieclient.model.Actor;

@RestController
@RequestMapping("/client/actor")
@RequiredArgsConstructor
public class ActorClient {

    private final RestTemplate restTemplate;

    private static final String API_URL = "http://localhost:8081/api/movies/";

    @GetMapping("/{lastname}")
    public Actor getActor(@PathVariable("lastname") String lastname) {

        ResponseEntity<Actor> actor = restTemplate.exchange(API_URL + lastname, HttpMethod.GET, null, new ParameterizedTypeReference<Actor>() {
        });

        return actor.getBody();
    }
}
