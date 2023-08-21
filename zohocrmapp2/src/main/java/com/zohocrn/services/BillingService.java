package com.zohocrn.services;

import java.util.List;

import com.zohocrn.entities.Billing;

public interface BillingService {

	void saveBill(Billing billing);

	List<Billing> getAllBills();
	
}
