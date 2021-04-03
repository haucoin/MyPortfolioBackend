package com.gcu.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.SkillDataService;
import com.gcu.model.Skill;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Skill Business Service
 * @Summary This class is business service that calls the Skill data service and performs any necessary business logic on the data received
 */


@Service
public class SkillBusinessService {

	// service - SkillDataService: A DAO that provides methods within the data service (or MongoRepository)
	@Autowired
	private final SkillDataService service;
	
	/**
	 * Skill Business Service constructor used to inject the DAO
	 * @param service - SkillDataService: Data Access Object
	 */
	public SkillBusinessService(SkillDataService service) {
		this.service = service;
	}
	
	/**
	 * Method findAllSkillsByType makes a request to the DOA to grab all the skills from the MongoDB database matching the given type
	 * @param type - String: The type of skill
	 * @return skills - List<Skill>: List of all skills matching the type
	 */
	public List<Skill> findAllSkillsByType(String type) {
		List<Skill> skills = service.getAllByType(type);
		return skills;
	}
	
}
