package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.RecommendationBusinessService;
import com.gcu.model.Recommendation;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Recommendation REST Controller
 * @Summary This class is a controller REST service that receives HTTP requests for Recommendations, calls the business service, and returns the data as a response
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/recommendations")
public class RecommendationRESTController {

	// service - RecommendationBusinessService: An object used to call methods within the business service
	@Autowired
	private final RecommendationBusinessService service;
	
	/**
	 * RecommendationRESTController constructor used to inject the RecommendationBusinessService through dependency injection
	 * @param service - RecommendationBusinessService: An object used to call methods within the business service
	 */
	public RecommendationRESTController(RecommendationBusinessService service) {
		this.service = service;
	}
	
	/**
	 * Method getAllRecommendations is a HTTP GET request that calls the findAllRecommendations method in the business service
	 * @return recommendations - List<Recommendation>: A list of recommendations returned from method call
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Recommendation> getAllRecommendations() {
		List<Recommendation> recommendations = service.findAllRecommendations();
		return recommendations;
	}
	
}
