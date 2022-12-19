package com.nrifintech.sbrest.service;
import java.util.List;
import com.nrifintech.sbrest.entities.Course;



public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course c);
	public Course updateCourse(Course c);
	public void deleteCourse(long courseId);
	
}
