package io.mano.messaging;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import io.mano.kafka.User;

@Component
public class Consumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "users", groupId = "group_id")
	public void consumeMessage(ConsumerRecord<String, User> record, Acknowledgment ack) {
		LOGGER.info("Consumed message key:{}, value : {}", record.key(), record.value());
		ack.acknowledge();
	}

}
