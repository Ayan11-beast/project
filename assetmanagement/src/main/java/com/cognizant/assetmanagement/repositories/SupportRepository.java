package com.cognizant.assetmanagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.assetmanagement.entities.SupportTickets;

public interface SupportRepository extends JpaRepository<SupportTickets, Integer> {
    SupportTickets findByAssignedToEmployee(String assignedToEmployee);
	
}
