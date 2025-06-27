package com.icar.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customers")
public class ClientTransaction {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="Firstname")
	private String 	Firstname;

	@Column(name="Lastname")
	private String 	Lastname;
	

	@Column(name="Mobile")
	private String 	Mobile;

	@Column(name="Email")
	private String 	Email;

	@Column(name="Address")
	private String 	Address;

	@Column(name="Location")
	private String 	Location;

	@Column(name="District")
	private String 	District;

	@Column(name="State")
	private String 	State;

	@Column(name="website")
	private String 	website;

	@Column(name="Designation")
	private String 	Designation;

	@Column(name="Companyname")
	private String 	Companyname;

	@Column(name="Block")
	private String 	Block;
	
	@Column(name="password")
	private String 	password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBlock() {
		return Block;
	}

	public void setBlock(String block) {
		Block = block;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	
	
	
}
