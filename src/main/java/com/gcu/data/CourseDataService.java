package com.gcu.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gcu.model.Course;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Course Data Service
 * @Summary This class is data service that extends the MongoRepository in order to use the built-in methods to query from the Mongo database
 */

@Repository
public interface CourseDataService extends MongoRepository <Course, String>{

}
