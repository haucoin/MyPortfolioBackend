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
	
	// type - String: The type of an experience (professional or volunteer)
	private String type;
	
	// company - String: The company name of an experience
	private String company;
	
	// department - String: The department within a company of an experience
	private String department;
	
	// location - String: The location of an experience
	private String location;
	
	// startDate - String: The start date of an experience (month year)
	private String startDate;
	
	// endDate - String: The end date of an experience (month year)
	private String endDate;
	
	
	/**
	 * Default Constructor
	 */
	public Experience() {
		this._id = null;
		this.name = "";
		this.description = "";
		this.type = "";
		this.company = "";
		this.department = "";
		this.location = "";
		this.startDate = "";
		this.endDate = "";
	}


	/**
	 * Non-Default Constructor
	 * @param name - String: The name of an experience
	 * @param description - String: The description of an experience
	 * @param type - String: The type of an experience (professional or volunteer)
	 * @param company - String: The company name of an experience
	 * @param department - String: The department within a company of an experience
	 * @param location - String: The location of an experience
	 * @param startDate - String: The start date of an experience (month year)
	 * @param endDate - String: The end date of an experience (month year)
	 */
	public Experience(String name, String description, String type, String company, String department, String location, String startDate, String endDate) {
		this._id = null;
		this.name = name;
		this.description = description;
		this.type = type;
		this.company = company;
		this.department = department;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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

}
