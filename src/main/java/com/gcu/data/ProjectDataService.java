package com.gcu.data;

import org.springframework.data.mongodb.repository.MongoRepository;
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

}
