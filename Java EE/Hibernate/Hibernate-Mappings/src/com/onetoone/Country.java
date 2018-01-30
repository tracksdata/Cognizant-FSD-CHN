package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {

	@Id
	private String countryId;
	private String countryName;

	@OneToOne(cascade=CascadeType.ALL)
	private CapitalCity city;

	public CapitalCity getCity() {
		return city;
	}

	public void setCity(CapitalCity city) {
		this.city = city;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
