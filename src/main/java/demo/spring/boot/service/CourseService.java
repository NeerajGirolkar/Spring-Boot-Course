package demo.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.spring.boot.repository.CourseRepository;
import demo.spring.boot.to.Course;

public class CourseService  {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id){
		List<Course> courseList = new ArrayList<Course>();
		courseRepository.findAll().forEach(courseList::add);
		return courseList;
	}
	
	public Course getCourse(String id){
		return courseRepository.findOne(id);	
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}