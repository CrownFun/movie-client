package pl.filewicz.movieclient.kafka.producer;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> producer;

    String kafkaTopic = "movie-library";

    public void send(String title) {
        producer.send(kafkaTopic, title);
    }

}
