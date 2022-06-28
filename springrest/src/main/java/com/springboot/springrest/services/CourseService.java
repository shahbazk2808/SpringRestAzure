package com.springboot.springrest.services;

import java.util.List;

import com.springboot.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
}
