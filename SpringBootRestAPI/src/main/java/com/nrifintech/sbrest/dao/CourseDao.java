package com.nrifintech.sbrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nrifintech.sbrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
