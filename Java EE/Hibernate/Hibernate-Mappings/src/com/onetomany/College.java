package com.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class College {

	@Id
	private int collegeId;
	private String collegeName;

	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(int collegeId, String collegeName) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="universityId")
	private University uni;

	public University getUni() {
		return uni;
	}

	public void setUni(University uni) {
		this.uni = uni;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
