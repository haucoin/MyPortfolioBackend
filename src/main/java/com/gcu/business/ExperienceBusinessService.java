package com.gcu.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.ExperienceDataService;
import com.gcu.model.Experience;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Experience Business Service
 * @Summary This class is business service that calls the Experience data service and performs any necessary business logic on the data received
 */


@Service
public class ExperienceBusinessService {

	// service - ExperienceDataService: A DAO that provides methods within the data service (or MongoRepository)
	@Autowired
	private final ExperienceDataService service;
	
	/**
	 * Experience Business Service constructor used to inject the DAO
	 * @param service - ExperienceDataService: Data Access Object
	 */
	public ExperienceBusinessService(ExperienceDataService service) {
		this.service = service;
	}
	
	/**
	 * Method findAllExperiencesByCompany makes a request to the DOA to grab all the experiences from the MongoDB database matching the given company name
	 * @param company - String: The company name of the experience
	 * @return experiences - List<Experience>: List of all experiences matching the company name
	 */
	public List<Experience> findAllExperiencesByCompany(String company) {
		List<Experience> experiences = service.getAllByCompany(company);
		return experiences;
	}
	
	/**
	 * Method findExperienceById takes in a specific ID to return a list of experiences that contain that id
	 * @param id - String: The generated ID of an experience within the database
	 * @return experiences - Optional<Experience>: A list of experiences retrieved from the database
	 */
	public Optional<Experience> findExperienceById(String id) {
		Optional<Experience> experiences = service.findById(id);
		return experiences;
	}
	
}
