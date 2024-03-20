package com.cognizant.assetmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.assetmanagement.entities.AssetsRegister;
import com.cognizant.assetmanagement.entities.SupportTickets;
import com.cognizant.assetmanagement.entities.TicketResolutions;
import com.cognizant.assetmanagement.models.AssetDetailsDTO;
import com.cognizant.assetmanagement.models.SupportTicketDTO;
import com.cognizant.assetmanagement.models.SupportTicketDetailsDTO;
import com.cognizant.assetmanagement.repositories.AssetsRepository;
import com.cognizant.assetmanagement.repositories.ResolutionsRepository;
import com.cognizant.assetmanagement.repositories.SupportRepository;
@Service
public class AssetManagementServicesImpl implements AssetManagementServices {
	@Autowired
	private AssetsRepository assetsRepository;
	@Autowired
	private ResolutionsRepository resolutionsRepository;
	@Autowired
	private SupportRepository supportRepository;
	@Override
	public String addAsset(AssetDetailsDTO assetDetailsDTO) {
		AssetsRegister assetsRegister=new AssetsRegister();
		assetsRegister.setAssetId(assetDetailsDTO.getAssetId());
		assetsRegister.setAssetType(assetDetailsDTO.getAssetType());
		assetsRegister.setIssuedOn(assetDetailsDTO.getIssuedOn());
		assetsRegister.setIssuedToEmployee(assetDetailsDTO.getIssuedToEmployee());
		assetsRegister.setMake(assetDetailsDTO.getMake());
		assetsRegister.setModelNo(assetDetailsDTO.getModelNo());
		if(assetsRepository.save(assetsRegister)!=null) {
			return "success";
		};
		return "fail";
	}

	@Override
	public String addSupportTicket(SupportTicketDTO supportTicketDTO) {
		SupportTickets supportTickets=new SupportTickets();
		supportTickets.setAssetId(assetsRepository.findById(supportTicketDTO.getAssetId()).get());
		supportTickets.setAssignedToEmployee(supportTicketDTO.getAssignedToEmployee());
		supportTickets.setExpectedResolution(supportTicketDTO.getExpectedResolution());
		supportTickets.setTicketId(supportTicketDTO.getTicketId());
		supportTickets.setTicketRaisedByEmployee(supportTicketDTO.getTicketRaisedByEmployee());
		supportTickets.setTicketRaisedOn(supportTicketDTO.getTicketRaisedOn());
		supportTickets.setTicketStatus(supportTicketDTO.getTicketStatus());
		if(supportRepository.save(supportTickets)!=null) {
			return "success";
		};
		return "fail";
	}

	@Override
	public SupportTicketDTO getTicketsById(String supportExecutiveId) {
		List<SupportTickets> list=supportRepository.findAll();
		for(SupportTickets supportTickets:list) {
			if(supportTickets.getAssignedToEmployee().equalsIgnoreCase(supportExecutiveId)) {
				SupportTicketDTO dto=new SupportTicketDTO();
				dto.setAssetId(supportTickets.getTicketId());
				dto.setAssignedToEmployee(supportTickets.getAssignedToEmployee());
				dto.setExpectedResolution(supportTickets.getExpectedResolution());
				dto.setTicketId(supportTickets.getTicketId());
				dto.setTicketRaisedByEmployee(supportTickets.getTicketRaisedByEmployee());
				dto.setTicketRaisedOn(supportTickets.getTicketRaisedOn());
				dto.setTicketStatus(supportTickets.getTicketStatus());
				return dto;
			}
		}
		return null;
	}

	@Override
	public SupportTicketDetailsDTO getAllSupportDetails(int ticketId) {
		List<TicketResolutions> list=resolutionsRepository.findAll();
		for(TicketResolutions resolutions:list) {
			if(resolutions.getTicketId().getTicketId()==ticketId) {
				SupportTicketDetailsDTO dto=new SupportTicketDetailsDTO();
				dto.setId(resolutions.getId());
				dto.setResolutionDate(resolutions.getResolutionDate());
				dto.setResolutionDescription(resolutions.getResolutionDescription());
				dto.setTicketId(resolutions.getTicketId().getTicketId());
				return dto;
			}
		}
		return null;
	}

	@Override
	public String writeResolution(int ticketId, String Resolution) {
		List<TicketResolutions> list=resolutionsRepository.findAll();
		for(TicketResolutions resolutions:list) {
			if(resolutions.getTicketId().getTicketId()==ticketId) {
				resolutions.setResolutionDescription(Resolution);
				if(resolutionsRepository.save(resolutions)!=null) {
					return "success";
				}
			}
		}
		return "fail";
	}

}
