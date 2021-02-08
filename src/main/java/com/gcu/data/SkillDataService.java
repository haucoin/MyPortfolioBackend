package com.gcu.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gcu.model.Skill;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Skill Data Service
 * @Summary This class is data service that extends the MongoRepository in order to use the built-in methods to query from the Mongo database
 */

@Repository
public interface SkillDataService extends MongoRepository <Skill, String>{

	/**
	 * Method findAllByType is a custom query method for MongoDB in order to retrieve a list of a certain type of skills
	 * @param type - String: The type of skill
	 * @return skills - List<Skill>: List of skills
	 */
	@Query("{'type': ?0}")
	public List<Skill> getAllByType(String type);
	
}
