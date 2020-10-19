package io.charan.springbootstarted.topicjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicJPAController {
	
	@Autowired
	private TopicJPAService topicService;
	
	@RequestMapping("/topics-new")
	public void getAllTopics() {
		topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.POST,value= {"/topics-new"})
	public void addTopic(TopicJPA topic) {
		topicService.addTopic(topic);
	}
}
