package com;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	private int personId;
	private int age;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
