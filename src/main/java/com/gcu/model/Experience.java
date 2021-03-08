package com.gcu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Experience Model
 * @Summary This class is an object model that represents an Experience and stores its properties
 */

@Document(collection = "Experiences")
public class Experience {
	
	@Id
	private String _id;
	
	// name - String: The name of an experience
	private String name;
	
	// description - String: The description of an experience
	private String description;
	
	// company - String: The company name of an experience
	private String company;	
	
	// location - String: The location of an experience
	private String location;
	
	// startDate - String: The start date of an experience (month year)
	private String startDate;
	
	// endDate - String: The end date of an experience (month year)
	private String endDate;
	
	// image - String: The name of the image of the experience
	private String image;
	
	
	/**
	 * Default Constructor
	 */
	public Experience() {
		this._id = null;
		this.name = "";
		this.description = "";
		this.company = "";
		this.location = "";
		this.startDate = "";
		this.endDate = "";
		this.image = "";
	}


	/**
	 * Non-Default Constructor
	 * @param name - String: The name of an experience
	 * @param description - String: The description of an experience
	 * @param company - String: The company name of an experience
	 * @param location - String: The location of an experience
	 * @param startDate - String: The start date of an experience (month year)
	 * @param endDate - String: The end date of an experience (month year)
	 * @param image - String: The name of the image of the experience
	 */
	public Experience(String name, String description, String company, String location, String startDate, String endDate, String image) {
		this._id = null;
		this.name = name;
		this.description = description;
		this.company = company;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.image = image;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
