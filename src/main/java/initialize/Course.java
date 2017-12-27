//-----------------------------------com.CourseTree.Course.java-----------------------------------

//package com.CourseTree;
package main.java.initialize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course implements Serializable
{

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("ID")
	@Expose
	private String iD;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("Pre")
	@Expose
	private List<String> pre = null;
	@SerializedName("Post")
	@Expose
	private List<String> post = null;
	@SerializedName("concentration")
	@Expose
	private String concentration;
	@SerializedName("credits")
	@Expose
	private Integer credits;
	private final static long serialVersionUID = -4167619154268982455L;

	/**
	* No args constructor for use in serialization
	* 
	*/
	public Course() {

		this("","","",new ArrayList<String>(), new ArrayList<String>(), "", 3);
	}

	/**
	* 
	* @param concentration
	* @param post
	* @param pre
	* @param description
	* @param name
	* @param credits
	* @param iD
	*/
	public Course(String name, String iD, String description, List<String> pre, List<String> post, String concentration, Integer credits) {
		super();
		this.name = name;
		this.iD = iD;
		this.description = description;
		this.pre = pre;
		this.post = post;
		this.concentration = concentration;
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return iD;
	}

	public void setID(String iD) {
		this.iD = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getPre() {
		return pre;
	}

	public void setPre(List<String> pre) {
		this.pre = pre;
	}

	public List<String> getPost() {
		return post;
	}

	public void setPost(List<String> post) {
		this.post = post;
	}

	public String getConcentration() {
		return concentration;
	}

	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	/*@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("iD", iD).append("description", description).append("pre", pre).append("post", post).append("concentration", concentration).append("credits", credits).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(concentration).append(post).append(pre).append(description).append(name).append(credits).append(iD).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Course) == false) {
			return false;
		}
		Course rhs = ((Course) other);
		return new EqualsBuilder().append(concentration, rhs.concentration).append(post, rhs.post).append(pre, rhs.pre).append(description, rhs.description).append(name, rhs.name).append(credits, rhs.credits).append(iD, rhs.iD).isEquals();
	}*/

}