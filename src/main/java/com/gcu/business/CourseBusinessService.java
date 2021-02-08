package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.CourseDataService;
import com.gcu.model.Course;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Course Business Service
 * @Summary This class is business service that calls the Course data service and performs any necessary business logic on the data received
 */

@Service
public class CourseBusinessService {

	// service - CourseDataService: A DAO that provides methods within the data service (or MongoRepository)
	@Autowired
	private final CourseDataService service;
	
	/**
	 * Course Business Service constructor used to inject the DAO
	 * @param service - CourseDataService: Data Access Object
	 */
	public CourseBusinessService(CourseDataService service) {
		this.service = service;
	}
	
	/**
	 * Method findAllCourses makes a request to the DOA to grab all the courses from the MongoDB database
	 * @return courses - List<Course>: List of all courses
	 */
	public List<Course> findAllCourses() {
		List<Course> courses = service.findAll();
		return courses;
	}
	
}
