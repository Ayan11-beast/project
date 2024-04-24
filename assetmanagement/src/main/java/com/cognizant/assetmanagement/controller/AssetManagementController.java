package com.cognizant.assetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cognizant.assetmanagement.models.AssetDetailsDTO;
import com.cognizant.assetmanagement.models.SupportTicketDTO;
import com.cognizant.assetmanagement.models.SupportTicketDetailsDTO;
import com.cognizant.assetmanagement.services.AssetManagementServices;
import com.cognizant.assetmanagement.services.AssetManagementServicesImpl;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class AssetManagementController {

	@Autowired
	private AssetManagementServicesImpl assetManagementServices;

	// EndPoint 1
	@PostMapping("/asset/register")
	public ResponseEntity<?> handleAddAsset(@Valid @RequestBody AssetDetailsDTO assetDetailsDTO) {
		System.out.println("AssetDetailsDTO:"+assetDetailsDTO);

		String result = assetManagementServices.addAsset(assetDetailsDTO);
		if (result.equals("success")) {
			return new ResponseEntity<>("Created", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Not Created", HttpStatus.BAD_REQUEST);
		}

	}

	// EndPoint 2
	@PostMapping("/supportrequests/new")
	public ResponseEntity<?> handleAddSupportTicket(@Valid @RequestBody SupportTicketDTO supportTicketDTO) {
System.out.println("supportTicketDTO:"+supportTicketDTO);
		String result = assetManagementServices.addSupportTicket(supportTicketDTO);
		if (result.equals("success")) {
			return new ResponseEntity<>("Created", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Not Created", HttpStatus.BAD_REQUEST);
		}

	}

	// EndPoint 3
	@GetMapping("/supportrequests/{executiveid}")
	public ResponseEntity<?> handleGetTicketsById(@PathVariable("executiveid") String executiveid) {
		System.out.println(executiveid);
		SupportTicketDTO dto = assetManagementServices.getTicketsById(executiveid);
		ResponseEntity<SupportTicketDTO> responseEntity = null;
		if (dto.getAssetId() != 0) {
			responseEntity = new ResponseEntity<SupportTicketDTO>(dto, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	// EndPoint 4
	/*
	@GetMapping("/supportrequest/{ticketid}")
	public ResponseEntity<?> handleGetAllSupportDetails(@PathVariable("ticketid") int ticketid) {
		System.out.println("Ticket id:"+ticketid);
		SupportTicketDetailsDTO dto = assetManagementServices.getAllSupportDetails(ticketid);
		ResponseEntity<SupportTicketDetailsDTO> responseEntity = null;
		if (dto.getId()!=0) {
			responseEntity = new ResponseEntity<SupportTicketDetailsDTO>(dto, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	
	}*/
	 //EndPoint 5
    @PutMapping("supportrequests/{ticketid}/resolve")
	public ResponseEntity<?> processReimbursements(@PathVariable("ticketid") int ticketid, @RequestBody SupportTicketDetailsDTO supportTicketDetailsDTO) {
		System.out.println("Ticket Id:"+ticketid);
		String result = assetManagementServices.writeResolution(ticketid, supportTicketDetailsDTO);
		if (result.equals("success")) {
			return new ResponseEntity<>(supportTicketDetailsDTO, HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		}
	}

    @GetMapping("supporttickets")
    public ResponseEntity<?> getAllSupportTickets(){
       List<SupportTicketDTO> supportTickets=assetManagementServices.getSupportTickets();
	   ResponseEntity responseEntity=null;
	   if(!supportTickets.isEmpty()){
		   responseEntity=new ResponseEntity<List<SupportTicketDTO>>(supportTickets,HttpStatus.OK);
		   return responseEntity;
	   }else{
		   responseEntity=new ResponseEntity(HttpStatus.NOT_FOUND);
	   }
	   return responseEntity;
    }
}


