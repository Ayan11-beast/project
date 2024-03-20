package com.cognizant.assetmanagement.models;

import java.time.LocalDate;


public class AssetDetailsDTO {

	private int AssetId;

	private LocalDate IssuedOn;

	private String IssuedToEmployee;

	private String ModelNo;

	private String Make;

	private String AssetType;

	public int getAssetId() {
		return AssetId;
	}

	public void setAssetId(int assetId) {
		AssetId = assetId;
	}

	public LocalDate getIssuedOn() {
		return IssuedOn;
	}

	public void setIssuedOn(LocalDate issuedOn) {
		IssuedOn = issuedOn;
	}

	public String getIssuedToEmployee() {
		return IssuedToEmployee;
	}

	public void setIssuedToEmployee(String issuedToEmployee) {
		IssuedToEmployee = issuedToEmployee;
	}

	public String getModelNo() {
		return ModelNo;
	}

	public void setModelNo(String modelNo) {
		ModelNo = modelNo;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getAssetType() {
		return AssetType;
	}

	public void setAssetType(String assetType) {
		AssetType = assetType;
	}
	
	
}
