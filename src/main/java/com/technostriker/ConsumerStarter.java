
package com.technostriker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ConsumerStarter {
	
	public static final Logger logger=LoggerFactory.getLogger(ConsumerStarter.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarter.class, args);
    }

    

    @KafkaListener(id = "test-consumer-group", topics = "my-kafka-topic")
    public void listen(String in) {
        System.out.println("Message Received >> "+in);
        
        logger.info("Consumer recived Message {}",in);
    }
}