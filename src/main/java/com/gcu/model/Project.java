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
	
	// logo - String: The logo image of a project
	private String logo;
	
	// coverImage - String: The name of the cover image of a project
	private String coverImage;
	
	// date - String: The approximate date of a project (semester)
	private String date;
	
	// introduction - String: The introduction of a project
	private String introduction;
	
	// objective - String: The objective of a project
	private String objective;
	
	// requirements - List<String>: The requirements of the project
	private List<String> requirements;
	
	// design - String: The design introduction of a project
	private String design;
	
	// designDescriptions - List<String>: The various design descriptions of a project
	private List<String> designDescriptions;
	
	// designImages - List<String>: The various design image names of a project
	private List<String> designImages;
	
	// finalDescription - String: The final description of a project
	private String finalDescription;
	
	// finalImages - HashMap<String, String>: The various final image names of a project
	private HashMap<String, String> finalImages;
	
	// technologies - List<String>: The names of the technologies used in a project
	private List<String> technologies;
	
	// languages - List<String>: The names of the languages used in a project
	private List<String> languages;
	
	// name - String: The link to the GitHub repository for this project
	private String gitHub;

	
	/**
	 * Default Constructor
	 */
	public Project() {
		this._id = null;
		this.name = "";
		this.logo = "";
		this.coverImage = "";
		this.date = "";
		this.introduction = "";
		this.objective = "";
		this.requirements = new ArrayList<String>();
		this.design = "";
		this.designDescriptions = new ArrayList<String>();
		this.designImages = new ArrayList<String>();
		this.finalDescription = "";
		this.finalImages = new HashMap<String, String>();
		this.technologies = new ArrayList<String>();
		this.languages = new ArrayList<String>();
		this.gitHub = "";
	}
	
	
	/**
	 * 
	 * @param name - String: The name of a project
	 * @param name - String: The logo image of a project
	 * @param coverImage - String: The name of the cover image of a project
	 * @param date - String: The approximate date of a project (semester)
	 * @param introduction - String: The introduction of a project
	 * @param objective - String: The objective of a project
	 * @param designDescriptions - List<String>: The various design descriptions of a project
	 * @param designImages - List<String>: The various design image names of a project
	 * @param finalDescription - String: The final description of a project
	 * @param finalImages - HashMap<String, String>: The various final image names of a project
	 * @param technologies - List<String>: The names of the technologies used in a project
	 * @param languages - List<String>: The names of the languages used in a project (used for tabular display)
	 * @param gitHub - String: The link to the GitHub repository for this project
	 */
	public Project(String name, String logo, String coverImage, String date, String introduction, String objective, List<String> requirements, String design, List<String> designDescriptions, List<String> designImages, String finalDescription, HashMap<String, String> finalImages, List<String> technologies, List<String> languages, String gitHub) {
		this._id = null;
		this.name = name;
		this.logo = logo;
		this.coverImage = coverImage;
		this.date = date;
		this.introduction = introduction;
		this.objective = objective;
		this.requirements = requirements;
		this.design = design;
		this.designDescriptions = designDescriptions;
		this.designImages = designImages;
		this.finalDescription = finalDescription;
		this.finalImages = finalImages;
		this.technologies = technologies;
		this.languages = languages;
		this.gitHub = gitHub;
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public List<String> getRequirements() {
		return requirements;
	}
	public void setRequirements(List<String> requirements) {
		this.requirements = requirements;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public List<String> getDesignDescriptions() {
		return designDescriptions;
	}
	public void setDesignDescriptions(List<String> designDescriptions) {
		this.designDescriptions = designDescriptions;
	}
	public List<String> getDesignImages() {
		return designImages;
	}
	public void setDesignImages(List<String> designImages) {
		this.designImages = designImages;
	}
	public String getFinalDescription() {
		return finalDescription;
	}
	public void setFinalDescription(String finalDescription) {
		this.finalDescription = finalDescription;
	}
	public HashMap<String, String> getFinalImages() {
		return finalImages;
	}
	public void setFinalImages(HashMap<String, String> finalImages) {
		this.finalImages = finalImages;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public String getGitHub() {
		return gitHub;
	}
	public void setGitHub(String gitHub) {
		this.gitHub = gitHub;
	}
}
