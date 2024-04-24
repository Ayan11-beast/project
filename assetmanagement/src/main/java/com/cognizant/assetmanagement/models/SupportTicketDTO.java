package com.cognizant.assetmanagement.models;

import java.time.LocalDate;

public class SupportTicketDTO {
	private int ticketId;

	private LocalDate ticketRaisedOn;

	private String ticketRaisedByEmployee;

	private int assetId;

	private String assignedToEmployee;

	private LocalDate expectedResolution;

	private String ticketStatus;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public LocalDate getTicketRaisedOn() {
		return ticketRaisedOn;
	}

	public void setTicketRaisedOn(LocalDate ticketRaisedOn) {
		this.ticketRaisedOn = ticketRaisedOn;
	}

	public String getTicketRaisedByEmployee() {
		return ticketRaisedByEmployee;
	}

	public void setTicketRaisedByEmployee(String ticketRaisedByEmployee) {
		this.ticketRaisedByEmployee = ticketRaisedByEmployee;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssignedToEmployee() {
		return assignedToEmployee;
	}

	public void setAssignedToEmployee(String assignedToEmployee) {
		this.assignedToEmployee = assignedToEmployee;
	}

	public LocalDate getExpectedResolution() {
		return expectedResolution;
	}

	public void setExpectedResolution(LocalDate expectedResolution) {
		this.expectedResolution = expectedResolution;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "SupportTicketDTO{" +
				"ticketId=" + ticketId +
				", ticketRaisedOn=" + ticketRaisedOn +
				", ticketRaisedByEmployee='" + ticketRaisedByEmployee + '\'' +
				", assetId=" + assetId +
				", assignedToEmployee='" + assignedToEmployee + '\'' +
				", expectedResolution=" + expectedResolution +
				", ticketStatus='" + ticketStatus + '\'' +
				'}';
	}
}

