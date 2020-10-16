package io.charan.springbootstarted.topic;

import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("Java","Core Java","Description - Core JAVA"),
			new Topic("Spring","Spring Framework","Description - Spring Framework"),
			new Topic("JavaScript","JavaScript","Description - JavaScript")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
