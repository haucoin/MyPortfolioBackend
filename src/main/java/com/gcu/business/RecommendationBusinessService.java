package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.RecommendationDataService;
import com.gcu.model.Recommendation;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Recommendation Business Service
 * @Summary This class is business service that calls the Recommendation data service and performs any necessary business logic on the data received
 */


@Service
public class RecommendationBusinessService {

	// service - RecommendationDataService: A DAO that provides methods within the data service (or MongoRepository)
	@Autowired
	private final RecommendationDataService service;
	
	/**
	 * Recommendation Business Service constructor used to inject the DAO
	 * @param service - RecommendationDataService: Data Access Object
	 */
	public RecommendationBusinessService(RecommendationDataService service) {
		this.service = service;
	}
	
	/**
	 * Method findAllRecommendations makes a request to the DOA to grab all the recommendations from the MongoDB database
	 * @return recommendations - List<Recommendation>: List of all recommendations
	 */
	public List<Recommendation> findAllRecommendations() {
		List<Recommendation> recommendations = service.findAll();
		return recommendations;
	}
	
}
