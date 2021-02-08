package com.gcu.model;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MyPortfolio
 * @Author Holland Aucoin
 * 
 * Recommendation Model
 * @Summary This class is an object model that represents a Recommendation and stores its properties
 */

@Document(collection = "Recommendations")
public class Recommendation {

	@Id
	private String _id;
	
	// name - String: The name of the author of the recommendation
	private String name;
	
	// position - String: The position of the author of the recommendation
	private String position;
	
	// letter - String: The letter or content of the recommendation
	private String letter;
	
	// image - String: The name of an image of the author of the recommendation
	private String image;
	
	// isShowing - boolean: A true or false if the recommendation is showing on the website
	private boolean isShowing;
	
	// contact - List<String>: The contact information of the author of the recommendation
	private HashMap<String, String> contact;
	
	
	/**
	 * Default Constructor
	 */
	public Recommendation() {
		this._id = null;
		this.name = "";
		this.position = "";
		this.letter = "";
		this.image = "";
		this.isShowing = false;
		this.contact = new HashMap<String, String>();	
	}


	/**
	 * Non-Default Constructor
	 * @param name - String: The name of the author of the recommendation
	 * @param position - String: The position of the author of the recommendation
	 * @param letter - String: The letter or content of the recommendation
	 * @param image - String: The name of an image of the author of the recommendation
	 * @param isShowing - boolean: A true or false if the recommendation is showing on the website
	 * @param contact - List<String>: The contact information of the author of the recommendation
	 */
	public Recommendation(String name, String position, String letter, String image, boolean isShowing, HashMap<String, String> contact) {
		this._id = null;
		this.name = name;
		this.position = position;
		this.letter = letter;
		this.image = image;
		this.isShowing = isShowing;
		this.contact = contact;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isShowing() {
		return isShowing;
	}
	public void setShowing(boolean isShowing) {
		this.isShowing = isShowing;
	}
	public HashMap<String, String> getContact() {
		return contact;
	}
	public void setContact(HashMap<String, String> contact) {
		this.contact = contact;
	}
	
}
