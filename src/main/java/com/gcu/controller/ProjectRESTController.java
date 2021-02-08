package com.gcu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.ProjectBusinessService;
import com.gcu.model.Project;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Project REST Controller
 * @Summary This class is a controller REST service that receives HTTP requests for Projects, calls the business service, and returns the data as a response
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/projects")
public class ProjectRESTController {

	// service - ProjectBusinessService: An object used to call methods within the business service
	@Autowired
	private final ProjectBusinessService service;
	
	/**
	 * ProjectRESTController constructor used to inject the ProjectBusinessService through dependency injection
	 * @param service - ProjectBusinessService: An object used to call methods within the business service
	 */
	public ProjectRESTController(ProjectBusinessService service) {
		this.service = service;
	}
	
	/**
	 * Method getAllProjectsByType is a HTTP GET request that calls the findAllProjectsByType method in the business service
	 * @param type - String: The type of project
	 * @return projects - List<Project>: A list of projects returned from method call
	 */
	@RequestMapping(value = "/all/{type}", method = RequestMethod.GET)
	public List<Project> getAllProjectsByType(@PathVariable String type) {
		List<Project> projects = service.findAllProjectsByType(type);
		return projects;
	}
	
	/**
	 * Method getProjectById is a HTTP GET request that calls the findProjectById method in the business service
	 * @param id - String: The generated ID of a project within the database
	 * @return project - Optional<Project>: A project object matching the given id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Project> getProjectById(@PathVariable String id) {
		Optional<Project> project = service.findProjectById(id);
		return project;
	}
	
}
