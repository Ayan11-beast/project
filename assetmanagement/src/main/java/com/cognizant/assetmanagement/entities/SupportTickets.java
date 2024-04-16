package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Support_Tickets")
public class SupportTickets {
	@Id
	@Column(name="Ticket_Id")
	private int ticketId;
	@Column(name="Ticket_Raised_On")
	private LocalDate ticketRaisedOn;
	@Column(name="Ticket_Raised_By_Employee")
	private String ticketRaisedByEmployee;
	@ManyToOne
	@JoinColumn(name="Asset_Id")
	private AssetsRegister assetId;
	@Column(name="Assigned_To_Employee")
	private String assignedToEmployee;
	@Column(name="Expected_Resolution")
	private LocalDate expectedResolution;
	@Column(name="Ticket_Status")
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
	public AssetsRegister getAssetId() {
		return assetId;
	}
	public void setAssetId(AssetsRegister assetId) {
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
		return "SupportTickets{" +
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
