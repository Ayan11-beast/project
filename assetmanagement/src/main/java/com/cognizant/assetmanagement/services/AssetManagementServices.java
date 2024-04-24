package com.cognizant.assetmanagement.services;

import com.cognizant.assetmanagement.entities.SupportTickets;
import com.cognizant.assetmanagement.models.AssetDetailsDTO;
import com.cognizant.assetmanagement.models.SupportTicketDTO;
import com.cognizant.assetmanagement.models.SupportTicketDetailsDTO;

import java.util.List;

public interface AssetManagementServices {
	
	public String addAsset(AssetDetailsDTO assetDetailsDTO);
	public String addSupportTicket(SupportTicketDTO supportTicketDTO);
	public SupportTicketDTO getTicketsById(String supportExecutiveId);
	public SupportTicketDetailsDTO getAllSupportDetails(int ticketId);
	public String writeResolution(int ticketId,SupportTicketDetailsDTO supportTicketDetailsDTO);
	public List<SupportTicketDTO> getSupportTickets();
}
