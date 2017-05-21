package demo.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import demo.spring.boot.to.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

}