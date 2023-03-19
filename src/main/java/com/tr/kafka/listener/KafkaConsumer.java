package com.tr.kafka.listener;

import com.tr.kafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "NewTopic", group = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "NewTopic_Json", group = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}
}
