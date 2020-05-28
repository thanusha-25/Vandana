package com.example.Bank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	@Column(name="branch_id")
	private int branhId;
	@Column(name="branch_name")
	private String branchName;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zipcode")
	private int zipcode;
	public int getBranhId() {
		return branhId;
	}
	public void setBranhId(int branhId) {
		this.branhId = branhId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Branch() {
		super();
	}
	public Branch(int branhId, String branchName, String city, String state, int zipcode) {
		super();
		this.branhId = branhId;
		this.branchName = branchName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
}
