package com.cognizant.assetmanagement;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;

import com.cognizant.assetmanagement.AssetmanagementApplication;
import com.cognizant.assetmanagement.entities.AssetsRegister;
import com.cognizant.assetmanagement.repositories.AssetsRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@DataJpaTest
@ContextConfiguration(classes = AssetmanagementApplication.class)
public class TestAssetsRepository {
	@Autowired
	private AssetsRepository assetRepository;
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void TestFindAllPositive() {
		AssetsRegister assetsRegister = new AssetsRegister();
        assetsRegister.setAssetId(1);
        assetsRegister.setAssetType("Laptop");
        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
        assetsRegister.setIssuedToEmployee("John Doe");
        assetsRegister.setMake("Dell");
        assetsRegister.setModelNo("XPS");
        
        entityManager.persist(assetsRegister);
		Iterable<AssetsRegister> it=assetRepository.findAll();
		assertTrue(it.iterator().hasNext());
	}
	
	@Test
	public void testFindAllNegative() {
		Iterable<AssetsRegister> it=assetRepository.findAll();
		assertTrue(!it.iterator().hasNext());
	}
	
	@Test
	public void TestFindByIdPositive() {
		AssetsRegister assetsRegister = new AssetsRegister();
        assetsRegister.setAssetId(1);
        assetsRegister.setAssetType("Laptop");
        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
        assetsRegister.setIssuedToEmployee("John Doe");
        assetsRegister.setMake("Dell");
        assetsRegister.setModelNo("XPS");
        
        entityManager.persist(assetsRegister);
        Optional<AssetsRegister> assetRegister=assetRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void testFindByIdNegative() {
		Optional<AssetsRegister> assetRegister=assetRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void TestSavePositive() {
		AssetsRegister assetsRegister = new AssetsRegister();
        assetsRegister.setAssetId(1);
        assetsRegister.setAssetType("Laptop");
        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
        assetsRegister.setIssuedToEmployee("John Doe");
        assetsRegister.setMake("Dell");
        assetsRegister.setModelNo("XPS");
        
//        entityManager.persist(assetsRegister);
        assetRepository.save(assetsRegister);
        Optional<AssetsRegister> assetRegister=assetRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void TestDeletePositive() {
		AssetsRegister assetsRegister = new AssetsRegister();
        assetsRegister.setAssetId(1);
        assetsRegister.setAssetType("Laptop");
        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
        assetsRegister.setIssuedToEmployee("John Doe");
        assetsRegister.setMake("Dell");
        assetsRegister.setModelNo("XPS");
        
        entityManager.persist(assetsRegister);
        assetRepository.delete(assetsRegister);
        
        Optional<AssetsRegister> assetRegister=assetRepository.findById(1);
		assertTrue(!assetRegister.isPresent());
	}
}
