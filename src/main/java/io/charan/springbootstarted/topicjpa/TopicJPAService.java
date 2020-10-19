package io.charan.springbootstarted.topicjpa;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

public class TopicJPAService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<TopicJPA> getAllTopics(){
		List<TopicJPA> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public void addTopic(TopicJPA topic) {
		topicRepository.save(topic);
	}
}
