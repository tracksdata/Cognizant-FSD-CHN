package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CapitalCity {

	@Id
	private String cityId;
	private String cityName;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
