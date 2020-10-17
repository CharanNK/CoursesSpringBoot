package io.charan.springbootstarted.topic;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Java","Core Java","Description - Core JAVA"),
			new Topic("Spring","Spring Framework","Description - Spring Framework"),
			new Topic("JavaScript","JavaScript","Description - JavaScript")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
