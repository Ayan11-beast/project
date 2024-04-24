package com.cognizant.assetmanagement.models;

import java.time.LocalDate;

public class SupportTicketDetailsDTO {

	private int id;

	private int ticketId;

	private LocalDate resolutionDate;

	private String resolutionDescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(LocalDate resolutionDate) {
		this.resolutionDate = resolutionDate;
	}

	public String getResolutionDescription() {
		return resolutionDescription;
	}

	public void setResolutionDescription(String resolutionDescription) {
		this.resolutionDescription = resolutionDescription;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketId() {
		return ticketId;
	}

	@Override
	public String toString() {
		return "SupportTicketDetailsDTO{" +
				"id=" + id +
				", ticketId=" + ticketId +
				", resolutionDate=" + resolutionDate +
				", resolutionDescription='" + resolutionDescription + '\'' +
				'}';
	}
}
