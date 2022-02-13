package io.mano.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import io.mano.kafka.User;

@Component
public class Producer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

	@Value("${topic.users}")
	private String usersTopic;

	private KafkaTemplate<String, User> kafkaTemplate;

	@Autowired
	public Producer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(User user) {
		this.kafkaTemplate.send(usersTopic, user.getName(), user);
		LOGGER.info("published message :: {}", user);
	}

}
