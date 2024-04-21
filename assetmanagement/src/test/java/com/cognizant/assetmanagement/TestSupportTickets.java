package com.cognizant.assetmanagement;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;

import com.cognizant.assetmanagement.entities.AssetsRegister;
import com.cognizant.assetmanagement.entities.SupportTickets;
import com.cognizant.assetmanagement.repositories.AssetsRepository;
import com.cognizant.assetmanagement.repositories.SupportRepository;

@DataJpaTest
@ContextConfiguration(classes = AssetmanagementApplication.class)
public class TestSupportTickets {
	@Autowired
	private SupportRepository supportRepository;
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void TestFindAllPositive() {
//		AssetsRegister assetsRegister = new AssetsRegister();
//        assetsRegister.setAssetId(1);
//        assetsRegister.setAssetType("Laptop");
//        assetsRegister.setIssuedOn(LocalDate.parse("2024-03-20"));
//        assetsRegister.setIssuedToEmployee("John Doe");
//        assetsRegister.setMake("Dell");
//        assetsRegister.setModelNo("XPS");
		
		SupportTickets supportTicket=new SupportTickets();
		supportTicket.setAssetId(null);
		supportTicket.setAssignedToEmployee(null);
		supportTicket.setExpectedResolution(null);
		supportTicket.setTicketRaisedByEmployee(null);
		supportTicket.setTicketRaisedOn(null);
		supportTicket.setTicketStatus(null);
        
        entityManager.persist(supportTicket);
		Iterable<SupportTickets> it=supportRepository.findAll();
		assertTrue(it.iterator().hasNext());
	}
	
	@Test
	public void testFindAllNegative() {
		Iterable<SupportTickets> it=supportRepository.findAll();
		assertTrue(it.iterator().hasNext());
	}
	
	@Test
	public void TestFindByIdPositive() {
		SupportTickets supportTicket=new SupportTickets();
		supportTicket.setAssetId(null);
		supportTicket.setAssignedToEmployee(null);
		supportTicket.setExpectedResolution(null);
		supportTicket.setTicketRaisedByEmployee(null);
		supportTicket.setTicketRaisedOn(null);
		supportTicket.setTicketStatus(null);
        
        entityManager.persist(supportTicket);
        Optional<SupportTickets> assetRegister=supportRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void testFindByIdNegative() {
		Optional<SupportTickets> assetRegister=supportRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void TestSavePositive() {
		SupportTickets supportTicket=new SupportTickets();
		supportTicket.setAssetId(null);
		supportTicket.setAssignedToEmployee(null);
		supportTicket.setExpectedResolution(null);
		supportTicket.setTicketRaisedByEmployee(null);
		supportTicket.setTicketRaisedOn(null);
		supportTicket.setTicketStatus(null);
        
//        entityManager.persist(assetsRegister);
        supportRepository.save(supportTicket);
        Optional<SupportTickets> assetRegister=supportRepository.findById(1);
		assertTrue(assetRegister.isPresent());
	}
	
	@Test
	public void TestDeletePositive() {
		SupportTickets supportTicket=new SupportTickets();
		supportTicket.setAssetId(null);
		supportTicket.setAssignedToEmployee(null);
		supportTicket.setExpectedResolution(null);
		supportTicket.setTicketRaisedByEmployee(null);
		supportTicket.setTicketRaisedOn(null);
		supportTicket.setTicketStatus(null);
        
        entityManager.persist(supportTicket);
        supportRepository.delete(supportTicket);
        Optional<SupportTickets> assetRegister=supportRepository.findById(1);
		assertTrue(!assetRegister.isPresent());
	}
}
