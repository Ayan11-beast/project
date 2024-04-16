package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Assets_Register")
public class AssetsRegister {
	@Id
	@Column(name="Asset_Id")
	private int assetId;
	@Column(name="Issued_On")
	private LocalDate issuedOn;
	@Column(name="Issued_To_Employee")
	private String issuedToEmployee;
	@Column(name="Mobile_No")
	private String modelNo;
	@Column(name="Make")
	private String make;
	@Column(name="Asset_Type")
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
