package com.crm.services;

import java.util.List;

import com.crm.entites.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> getAllContacts();

}
