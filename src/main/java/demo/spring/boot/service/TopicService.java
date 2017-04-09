package demo.spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.spring.boot.to.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("001", "Spring Boot", "Simplest Course on Spring Boot"),
			new Topic("002", "Hibernate", "Getting started with Hibernate"),
			new Topic("003", "Java", "This course includes Java 8")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		for(Topic topic : topics){
			if(topic.getId().equalsIgnoreCase(id)){
				return topic;				
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(Topic updatedTopic, String id) {
		for(Topic topic : topics){
			if(topic.getId().equalsIgnoreCase(id)){
				topics.remove(topic);
				break;
			}
		}
		topics.add(updatedTopic);
	}
	
	public void deleteTopic(String id) {
		for(Topic topic : topics){
			if(topic.getId().equalsIgnoreCase(id)){
				topics.remove(topic);
				break;
			}
		}
	}
}