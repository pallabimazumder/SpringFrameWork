package com.nrifintech.sbrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nrifintech.sbrest.dao.CourseDao;
import com.nrifintech.sbrest.entities.Course;

@Service   //To make it Service Layer
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao cdao;
	
	@Override
	public List<Course> getCourses() {
		return cdao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		//return cdao.getOne(courseId);
		return cdao.findById(courseId).get();
	}


	@Override
	public Course addCourse(Course c) {
		return cdao.save(c);
	}


	@Override
	public Course updateCourse(Course c) {
		return cdao.save(c);
	}


	@Override
	public void deleteCourse(long courseId) {
		Course c = cdao.getOne(courseId);
		cdao.delete(c);
	}
	
	
}
