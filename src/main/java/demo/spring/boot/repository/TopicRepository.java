package demo.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import demo.spring.boot.to.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}