package com.cognizant.assetmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.assetmanagement.entities.TicketResolutions;

public interface ResolutionsRepository extends JpaRepository<TicketResolutions, Integer> {

}
