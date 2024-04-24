package com.cognizant.assetmanagement.models;

import java.time.LocalDate;


public class AssetDetailsDTO {

	private int assetId;

	private LocalDate issuedOn;

	private String issuedToEmployee;

	private String modelNo;

	private String make;

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

	@Override
    public String toString() {
        return "AssetDetailsDTO{" +
                "qssetId=" + assetId +
                ", issuedOn=" + issuedOn +
                ", issuedToEmployee='" + issuedToEmployee + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", make='" + make + '\'' +
                ", assetType='" + assetType + '\'' +
                '}';
    }
}
