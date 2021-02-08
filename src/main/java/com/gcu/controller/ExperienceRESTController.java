package com.gcu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.ExperienceBusinessService;
import com.gcu.model.Experience;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Experience REST Controller
 * @Summary This class is a controller REST service that receives HTTP requests for Experiences, calls the business service, and returns the data as a response
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/experiences")
public class ExperienceRESTController {

	// service - ExperienceBusinessService: An object used to call methods within the business service
	@Autowired
	private final ExperienceBusinessService service;
	
	/**
	 * ExperienceRESTController constructor used to inject the ExperienceBusinessService through dependency injection
	 * @param service - ExperienceBusinessService: An object used to call methods within the business service
	 */
	public ExperienceRESTController(ExperienceBusinessService service) {
		this.service = service;
	}
	
	/**
	 * Method getAllExperiencesByType is a HTTP GET request that calls the findAllExperiencesByType method in the business service
	 * @param type - String: The type of experience
	 * @return experiences - List<Experience>: A list of experiences returned from method call
	 */
	@RequestMapping(value = "/all/{type}", method = RequestMethod.GET)
	public List<Experience> getAllExperiencesByType(@PathVariable String type) {
		List<Experience> experiences = service.findAllExperiencesByType(type);
		return experiences;
	}
	
	/**
	 * Method getExperienceById is a HTTP GET request that calls the findExperienceById method in the business service
	 * @param id - String: The generated ID of an experience within the database
	 * @return experience - Optional<Experience>: An experience object matching the given id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Experience> getExperienceById(@PathVariable String id) {
		Optional<Experience> experience = service.findExperienceById(id);
		return experience;
	}
	
}
