package com.cognizant.assetmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.assetmanagement.entities.AssetsRegister;

public interface AssetsRepository extends JpaRepository<AssetsRegister, Integer> {

}
