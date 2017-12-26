//-----------------------------------com.CourseTree.Catalog.java-----------------------------------

	package com.CourseTree;

	import java.io.Serializable;
	import java.util.List;
	import com.google.gson.annotations.Expose;
	import com.google.gson.annotations.SerializedName;
	import org.apache.commons.lang.builder.EqualsBuilder;
	import org.apache.commons.lang.builder.HashCodeBuilder;
	import org.apache.commons.lang.builder.ToStringBuilder;

	public class Catalog implements Serializable
	{

		@SerializedName("catalog")
		@Expose
		private List<Course> catalog = null;
		private final static long serialVersionUID = -7601192554470053005L;

	/**
	* No args constructor for use in serialization
	* 
	*/
	public Catalog() {
	}

	/**
	* 
	* @param catalog
	*/
	public Catalog(List<Course> catalog) {
		super();
		this.catalog = catalog;
	}

	public List<Course> getCatalog() {
		return catalog;
	}

	public void setCatalog(List<Course> catalog) {
		this.catalog = catalog;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("catalog", catalog).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(catalog).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Catalog) == false) {
			return false;
		}
		Catalog rhs = ((Catalog) other);
		return new EqualsBuilder().append(catalog, rhs.catalog).isEquals();
	}

}