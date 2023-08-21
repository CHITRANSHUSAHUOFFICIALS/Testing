package com.zohocrn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrn.entities.Billing;
import com.zohocrn.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing billing) {
		billingRepo.save(billing);
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> findAll = billingRepo.findAll();
		return findAll;
	}

}
