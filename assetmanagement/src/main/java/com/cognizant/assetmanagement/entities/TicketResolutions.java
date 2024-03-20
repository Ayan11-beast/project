package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="ticketresolutions")
public class TicketResolutions {
	@Id
	@Column(name="id")
	private int id;
	@ManyToOne
	@JoinColumn(name="ticketid")
	private SupportTickets ticketId;
	@Column(name="resolutiondate")
	private LocalDate resolutionDate;
	@Column(name="resolutiondescription")
	private String resolutionDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SupportTickets getTicketId() {
		return ticketId;
	}
	public void setTicketId(SupportTickets ticketId) {
		this.ticketId = ticketId;
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
	
}
