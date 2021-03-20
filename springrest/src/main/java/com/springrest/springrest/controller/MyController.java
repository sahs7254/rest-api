package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController 
{
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return " This is my home page";
	}
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses
	{
		return this.courseService.getCourses();
	}

}
