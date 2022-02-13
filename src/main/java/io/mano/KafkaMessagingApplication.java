package io.mano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.mano.service.KafkaService;

@SpringBootApplication
public class KafkaMessagingApplication implements CommandLineRunner {
	
	@Autowired
	private KafkaService kafkaService;

	public static void main(String[] args) {
		SpringApplication.run(KafkaMessagingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int count = 2;
		
		for (int i=1; i<=count; i++) {
			kafkaService.publish(i);
		}
		
	}

}
