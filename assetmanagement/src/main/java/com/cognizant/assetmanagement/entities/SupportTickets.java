package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity(name="supporttickets")
public class SupportTickets {
	@Id
	@Column(name="ticketid")
	private int ticketId;
	@Column(name="ticketraisedon")
	private LocalDate ticketRaisedOn;
	@Column(name="ticketraisedbyemployee")
	private String ticketRaisedByEmployee;
	@ManyToOne
	@JoinColumn(name="assetid")
	private AssetsRegister AssetId;
	@Column(name="assignedtoemployee")
	private String assignedToEmployee;
	@Column(name="expectedresolution")
	private LocalDate expectedResolution;
	@Column(name="ticketstatus")
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
		return AssetId;
	}
	public void setAssetId(AssetsRegister assetId) {
		AssetId = assetId;
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
	
	
}
