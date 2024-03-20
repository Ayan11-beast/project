package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity(name="assetsregister")
public class AssetsRegister {
	@Id
	@Column(name="assetid")
	private int assetId;
	@Column(name="issuedon")
	private LocalDate issuedOn;
	@Column(name="issuedtoemployee")
	private String issuedToEmployee;
	@Column(name="mobileno")
	private String modelNo;
	@Column(name="make")
	private String make;
	@Column(name="assettype")
	private String assetType;
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public LocalDate getIssuedOn() {
		return issuedOn;
	}
	public void setIssuedOn(LocalDate issuedOn) {
		this.issuedOn = issuedOn;
	}
	public String getIssuedToEmployee() {
		return issuedToEmployee;
	}
	public void setIssuedToEmployee(String issuedToEmployee) {
		this.issuedToEmployee = issuedToEmployee;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	
	
}
