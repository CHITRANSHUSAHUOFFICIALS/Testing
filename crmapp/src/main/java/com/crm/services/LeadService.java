package com.crm.services;

import com.crm.entites.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public Lead getLeadById(long id);

	public void deleteById(long id);
}
