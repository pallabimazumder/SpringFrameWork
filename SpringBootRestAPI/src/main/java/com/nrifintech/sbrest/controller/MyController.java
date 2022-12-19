package com.nrifintech.sbrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nrifintech.sbrest.entities.Course;
import com.nrifintech.sbrest.service.CourseService;

@RestController            //To specify it contains all the API Endpoints
public class MyController {
	
	@Autowired   //to create the object
	private CourseService cs;
	
	//CREATING THE HANDLERS
	
	@GetMapping("/home")   //whenever /home url will be hit, this func will be run
	public String home() {
		return "Course Back ENd Rest API Endpoints Version 1.0";
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return this.cs.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getFilteredCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addNewCourse(@RequestBody Course cobj) {
		return this.cs.addCourse(cobj);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course cobj) {
		return this.cs.updateCourse(cobj);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity deleteCourse(@PathVariable String courseId) {
		try {
			this.cs.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
