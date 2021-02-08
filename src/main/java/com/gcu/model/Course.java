package com.gcu.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Course Model
 * @Summary This class is an object model that represents a Course and stores its properties
 */

@Document(collection = "Courses")
public class Course {
	
	@Id
	private String _id;
	
	// name - String: The name of a course
	private String name;
	
	// description - String: The description of a course
	private String description;
	
	// technology - List<String>: The names of the technologies used in a course
	private List<String> technology;
	
	// projectId - String: The projectId of a project that was created in the course
	private String projectId;
	
	
	/**
	 * Default Constructor
	 */
	public Course() {
		this._id = null;
		this.name = "";
		this.description = "";
		this.technology = new ArrayList<String>();
		this.projectId = "";
	}
	
	
	/**
	 * Non-Default Constructor
	 * @param name - String: The name of a course
	 * @param description - String: The description of a course
	 * @param technology - List<String>: The names of the technologies used in a course
	 * @param projectId - String: The projectId of a project that was created in the course
	 */
	public Course(String name, String description, List<String> technology, String projectId) {
		this._id = null;
		this.name = name;
		this.description = description;
		this.technology = technology;
		this.projectId = projectId;
	}
	

	/**
	 * Getters and setters
	 */
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
}
