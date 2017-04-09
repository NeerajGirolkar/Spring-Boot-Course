package demo.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.spring.boot.repository.TopicRepository;
import demo.spring.boot.to.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topicList = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);	
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic updatedTopic, String id) {
		topicRepository.delete(id);
		topicRepository.save(updatedTopic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}