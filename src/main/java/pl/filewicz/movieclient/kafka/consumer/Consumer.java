package pl.filewicz.movieclient.kafka.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pl.filewicz.movieclient.usecase.SendMovieToCinema;

@Service

public class Consumer {

    @Autowired
    private  SendMovieToCinema sendMovieToCinema;


    public void receiveMessage(String title) {
        System.out.println("pobrano tytuł " + title);
        sendMovieToCinema.execute(title);

    }

}
