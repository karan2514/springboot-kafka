package net.javaguides.springboot.kafka;

import net.javaguides.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);




    @KafkaListener(topics = "javaguides_json",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}
