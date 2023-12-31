package com.zohocrn.services;

import java.util.List;

import com.zohocrn.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);

	public List<Lead> getAllLeads();

	public Lead findById(Long id);
}
