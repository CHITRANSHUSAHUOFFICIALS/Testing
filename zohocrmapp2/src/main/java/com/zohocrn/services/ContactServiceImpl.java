package com.zohocrn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrn.entities.Contacts;
import com.zohocrn.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contacts findById(Long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

}
