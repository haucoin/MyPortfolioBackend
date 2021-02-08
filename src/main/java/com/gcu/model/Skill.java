package com.gcu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Skill Model
 * @Summary This class is an object model that represents a Skill and stores its properties
 */

@Document(collection = "Skills")
public class Skill {

	@Id
	private String _id;
	
	// name - String: The name of the skill
	private String name;
	
	// type - String: The type of skill
	private String type;
	
	/**
	 * Default Constructor
	 */
	public Skill() {
		this._id = null;
		this.name = "";
		this.type = "";
	}

	
	/**
	 * Non-Default Constructor
	 * @param name - String: The name of the skill
	 * @param type - String: The type of skill
	 */
	public Skill(String name, String type) {
		this._id = null;
		this.name = name;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
