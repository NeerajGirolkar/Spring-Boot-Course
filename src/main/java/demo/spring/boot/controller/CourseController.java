package demo.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.boot.service.CourseService;
import demo.spring.boot.to.Course;

public class CourseController{

	@Autowired
	private CourseService courseService;

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" }, path = "/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" }, path = "/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/topics/{id}/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id) {
		courseService.updateCourse(course, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
