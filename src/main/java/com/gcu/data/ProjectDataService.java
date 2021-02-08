package com.gcu.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gcu.model.Project;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Project Data Service
 * @Summary This class is data service that extends the MongoRepository in order to use the built-in methods to query from the Mongo database
 */

@Repository
public interface ProjectDataService extends MongoRepository <Project, String>{

	/**
	 * Method findAllByType is a custom query method for MongoDB in order to retrieve a list of a certain type of projects
	 * @param type - String: The type of project
	 * @return projects - List<Project>: List of projects
	 */
	@Query("{'type': ?0}")
	public List<Project> getAllByType(String type);
}
