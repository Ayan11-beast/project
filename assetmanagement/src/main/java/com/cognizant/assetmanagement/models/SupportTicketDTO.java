package com.cognizant.assetmanagement.models;

import java.time.LocalDate;

public class SupportTicketDTO {
	private int TicketId;

	private LocalDate TicketRaisedOn;

	private String TicketRaisedByEmployee;

	private int AssetId;

	private String AssignedToEmployee;

	private LocalDate ExpectedResolution;

	private String TicketStatus;

	public int getTicketId() {
		return TicketId;
	}

	public void setTicketId(int ticketId) {
		TicketId = ticketId;
	}

	public LocalDate getTicketRaisedOn() {
		return TicketRaisedOn;
	}

	public void setTicketRaisedOn(LocalDate ticketRaisedOn) {
		TicketRaisedOn = ticketRaisedOn;
	}

	public String getTicketRaisedByEmployee() {
		return TicketRaisedByEmployee;
	}

	public void setTicketRaisedByEmployee(String ticketRaisedByEmployee) {
		TicketRaisedByEmployee = ticketRaisedByEmployee;
	}

	public int getAssetId() {
		return AssetId;
	}

	public void setAssetId(int assetId) {
		AssetId = assetId;
	}

	public String getAssignedToEmployee() {
		return AssignedToEmployee;
	}

	public void setAssignedToEmployee(String assignedToEmployee) {
		AssignedToEmployee = assignedToEmployee;
	}

	public LocalDate getExpectedResolution() {
		return ExpectedResolution;
	}

	public void setExpectedResolution(LocalDate expectedResolution) {
		ExpectedResolution = expectedResolution;
	}

	public String getTicketStatus() {
		return TicketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	
}
