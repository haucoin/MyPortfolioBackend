package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.CourseBusinessService;
import com.gcu.model.Course;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Course REST Controller
 * @Summary This class is a controller REST service that receives HTTP requests for Courses, calls the business service, and returns the data as a response
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/courses")
public class CourseRESTController {

	// service - CourseBusinessService: An object used to call methods within the business service
	@Autowired
	private final CourseBusinessService service;
	
	/**
	 * CourseRESTController constructor used to inject the CourseBusinessService through dependency injection
	 * @param service - CourseBusinessService: An object used to call methods within the business service
	 */
	public CourseRESTController(CourseBusinessService service) {
		this.service = service;
	}
	
	/**
	 * Method getAllCourses is a HTTP GET request that calls the findAllCourses method in the business service
	 * @return courses - List<Course>: A list of courses returned from method call
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Course> getAllCourses() {
		List<Course> courses = service.findAllCourses();
		return courses;
	}
	
}
