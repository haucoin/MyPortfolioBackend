package com.gcu.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.ProjectDataService;
import com.gcu.model.Project;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Project Business Service
 * @Summary This class is business service that calls the Project data service and performs any necessary business logic on the data received
 */


@Service
public class ProjectBusinessService {

	// service - ProjectDataService: A DAO that provides methods within the data service (or MongoRepository)
	@Autowired
	private final ProjectDataService service;
	
	/**
	 * Project Business Service constructor used to inject the DAO
	 * @param service - ProjectDataService: Data Access Object
	 */
	public ProjectBusinessService(ProjectDataService service) {
		this.service = service;
	}
	
	/**
	 * Method findAllProjectsByType makes a request to the DOA to grab all the projects from the MongoDB database matching the given type
	 * @param type - String: The type of project
	 * @return projects - List<Project>: List of all projects matching the type
	 */
	public List<Project> findAllProjectsByType(String type) {
		List<Project> projects = service.getAllByType(type);
		return projects;
	}
	
	/**
	 * Method findProjectById takes in a specific ID to return a list of projects that contain that id
	 * @param id - String: The generated ID of a project within the database
	 * @return projects - Optional<Project>: A list of projects retrieved from the database
	 */
	public Optional<Project> findProjectById(String id) {
		Optional<Project> projects = service.findById(id);
		return projects;
	}
	
}
