package com.springboot.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springrest.entities.Course;
import com.springboot.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		
		return "This is the home page";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseservice.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
}
