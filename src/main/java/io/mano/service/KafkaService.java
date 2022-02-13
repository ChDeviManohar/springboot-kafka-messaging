package io.mano.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mano.kafka.User;
import io.mano.messaging.Producer;

@Service
public class KafkaService {

	@Autowired
	private Producer producer;

	public void publish(int i) {
		List<String> names = Arrays.asList("One", "Two", "Three");
		for (String name : names) {
			User user = User.newBuilder().setName("KafkaUser:" + i + ":" + name).setAge(i).build();
			producer.sendMessage(user);
		}
	}

}
