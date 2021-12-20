package com.saraya.DakarTechUniversity.model;

public class User {
	
	
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private String programInterest;
	private String degreeLevel;
	
	public User(String firstName, String lastName, String email, int phoneNumber, String programInterest,
			String degreeLevel) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.programInterest = programInterest;
		this.degreeLevel = degreeLevel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProgramInterest() {
		return programInterest;
	}

	public void setProgramInterest(String programInterest) {
		this.programInterest = programInterest;
	}

	public String getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(String degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", programInterest=" + programInterest + ", degreeLevel=" + degreeLevel + "]";
	}
	
	
	 
	
	

}
