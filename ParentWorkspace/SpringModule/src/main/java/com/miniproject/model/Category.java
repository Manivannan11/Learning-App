package com.miniproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Muhil Kennedy
 * Category tree structure can be maintianed.
 * We might need to remove / query recursively the category via java.
 *
 */
@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private Integer cId;
	
	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "PARENTID")
	private Integer parentId;
	
	public Category() {}
	
	public Category(String category, int parentId) {
		this.category = category;
		this.parentId = parentId;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}
