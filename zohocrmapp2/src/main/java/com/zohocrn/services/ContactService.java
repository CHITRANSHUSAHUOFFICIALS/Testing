package com.zohocrn.services;

import java.util.List;

import com.zohocrn.entities.Contacts;

public interface ContactService {
	
	public void saveContact(Contacts contact);

	public List<Contacts> getAllContacts();

	public Contacts findById(Long id);
}
