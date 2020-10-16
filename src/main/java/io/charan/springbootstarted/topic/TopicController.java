package io.charan.springbootstarted.topic;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Java","Core Java","Description - Core JAVA"),
				new Topic("Spring","Spring Framework","Description - Spring Framework"),
				new Topic("JavaScript","JavaScript","Description - JavaScript")
				);
	}
}
