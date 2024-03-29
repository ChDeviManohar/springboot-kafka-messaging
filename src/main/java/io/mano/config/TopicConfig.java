package io.mano.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

	@Value("${topic.users}")
	private String usersTopic;

	@Bean
	public NewTopic usersTopic() {
		return TopicBuilder.name(usersTopic).build();
	}

}
