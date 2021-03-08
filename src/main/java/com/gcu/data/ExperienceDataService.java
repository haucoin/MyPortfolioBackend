package com.gcu.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gcu.model.Experience;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Experience Data Service
 * @Summary This class is data service that extends the MongoRepository in order to use the built-in methods to query from the Mongo database
 */

@Repository
public interface ExperienceDataService extends MongoRepository <Experience, String>{

	/**
	 * Method findAllByCompany is a custom query method for MongoDB in order to retrieve a list of experiences of a company
	 * @param company - String: The company name of an experience
	 * @return experiences - List<Experience>: List of experiences
	 */
	@Query("{'company': ?0}")
	public List<Experience> getAllByCompany(String company);
}
