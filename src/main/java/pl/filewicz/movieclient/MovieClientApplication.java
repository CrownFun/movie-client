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


    }

}
