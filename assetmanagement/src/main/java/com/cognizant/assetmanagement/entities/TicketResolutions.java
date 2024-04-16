package com.cognizant.assetmanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="Ticket_Resolution")
public class TicketResolutions {
	@Id
	@Column(name="Id")
	private int id;
	@ManyToOne
	@JoinColumn(name="Ticket_Id")
	private SupportTickets ticketId;
	@Column(name="Resolution_Date")
	private LocalDate resolutionDate;
	@Column(name="Resolution_Description")
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
