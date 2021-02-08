package com.gcu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Project Model
 * @Summary This class is an object model that represents a Project and stores its properties
 */

@Document(collection = "Projects")
public class Project {

	@Id
	private String _id;
	
	// name - String: The name of a project
	private String name;
	
	// description - HashMap<String, String>: The various descriptions of a project
	private HashMap<String, String> description;
	
	// image - HashMap<String, String>: The various image names of a project
	private HashMap<String, String> image;
	
	// technology - List<String>: The names of the technologies used in a project
	private List<String> technology;
	
	// type - String: The type of project (completed or current)
	private String type;

	
	/**
	 * Default Constructor
	 */
	public Project() {
		this._id = null;
		this.name = "";
		this.description = new HashMap<String, String>();
		this.image = new HashMap<String, String>();
		this.technology = new ArrayList<String>();
		this.type = "";
	}
	
	
	/**
	 * Non-Default Constructor
	 * @param name - String: The name of a project
	 * @param description - HashMap<String, String>: The various descriptions of a project
	 * @param image - HashMap<String, String>: The various image names of a project
	 * @param technology - List<String>: The names of the technologies used in a project
	 * @param type - String: The type of project (completed or current)
	 */
	public Project(String name, HashMap<String, String> description, HashMap<String, String> image, List<String> technology, String type) {
		this._id = null;
		this.name = name;
		this.description = description;
		this.image = image;
		this.technology = technology;
		this.type = type;
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
	public HashMap<String, String> getDescription() {
		return description;
	}
	public void setDescription(HashMap<String, String> description) {
		this.description = description;
	}
	public HashMap<String, String> getImage() {
		return image;
	}
	public void setImage(HashMap<String, String> image) {
		this.image = image;
	}
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
