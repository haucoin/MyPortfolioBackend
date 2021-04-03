package com.gcu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.SkillBusinessService;
import com.gcu.model.Skill;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Skill REST Controller
 * @Summary This class is a controller REST service that receives HTTP requests for Skills, calls the business service, and returns the data as a response
 */

@CrossOrigin(origins = "https://hollandaucoin.com")
@RestController
@RequestMapping(value = "/skills")
public class SkillRESTController {

	// service - SkillBusinessService: An object used to call methods within the business service
	@Autowired
	private final SkillBusinessService service;
	
	/**
	 * SkillRESTController constructor used to inject the SkillBusinessService through dependency injection
	 * @param service - SkillBusinessService: An object used to call methods within the business service
	 */
	public SkillRESTController(SkillBusinessService service) {
		this.service = service;
	}
	
	/**
	 * Method getAllSkillsByType is a HTTP GET request that calls the findAllSkillsByType method in the business service
	 * @param type - String: The type of skill
	 * @return skills - List<Skill>: A list of skills returned from method call
	 */
	@RequestMapping(value = "/all/{type}", method = RequestMethod.GET)
	public List<Skill> getAllSkillsByType(@PathVariable String type) {
		List<Skill> skills = service.findAllSkillsByType(type);
		return skills;
	}
	
}
