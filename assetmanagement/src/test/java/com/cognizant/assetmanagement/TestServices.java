package com.cognizant.assetmanagement;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognizant.assetmanagement.entities.AssetsRegister;
import com.cognizant.assetmanagement.models.AssetDetailsDTO;
import com.cognizant.assetmanagement.repositories.AssetsRepository;
import com.cognizant.assetmanagement.repositories.ResolutionsRepository;
import com.cognizant.assetmanagement.repositories.SupportRepository;
import com.cognizant.assetmanagement.services.AssetManagementServicesImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
class TestServices {
	
	private AssetManagementServicesImpl assetManagementService;
    private AssetsRepository assetsRepository;
    private SupportRepository supportRepository;
    private ResolutionsRepository resolutionsRepository;
	
	
	@BeforeEach
    public void setUp() {
        assetsRepository = mock(AssetsRepository.class);
        supportRepository = mock(SupportRepository.class);
        resolutionsRepository = mock(ResolutionsRepository.class);
        //assetManagementService = new AssetManagementServicesImpl(assetsRepository, resolutionsRepository, supportRepository);
    }

	 @Test
	    public void testAddAsset_Success() {
	        AssetDetailsDTO assetDetailsDTO = new AssetDetailsDTO();
	        assetDetailsDTO.setAssetId(100);
	        assetDetailsDTO.setAssetType("Laptop");
	        assetDetailsDTO.setIssuedOn(LocalDate.parse("2024-03-20"));
	        assetDetailsDTO.setIssuedToEmployee("John Doe");
	        assetDetailsDTO.setMake("Dell");
	        assetDetailsDTO.setModelNo("XPS");
	 
	        AssetsRegister assetsRegister = new AssetsRegister();
	        assetsRegister.setAssetId(1);
	        assetsRegister.setAssetType("Laptop");
	        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
	        assetsRegister.setIssuedToEmployee("John Doe");
	        assetsRegister.setMake("Dell");
	        assetsRegister.setModelNo("XPS");
	 
	        when(assetsRepository.save(any(AssetsRegister.class))).thenReturn(assetsRegister);
	 
	        String result = assetManagementService.addAsset(assetDetailsDTO);
	 
	        assertEquals("success", result);
	        verify(assetsRepository, times(1)).save(any(AssetsRegister.class));
	    }
	 
	    @Test
	    public void testAddAsset_Failure() {
	        AssetDetailsDTO assetDetailsDTO = new AssetDetailsDTO();
	 
	        when(assetsRepository.save(any(AssetsRegister.class))).thenReturn(null);
	 
	        String result = assetManagementService.addAsset(assetDetailsDTO);
	 
	        assertEquals("fail", result);
	        verify(assetsRepository, times(1)).save(any(AssetsRegister.class));
	    }
	}

