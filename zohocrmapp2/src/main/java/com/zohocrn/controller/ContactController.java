package com.zohocrn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrn.entities.Contacts;
import com.zohocrn.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") Long id ,Model model) {
		Contacts contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(Model model) {
		List<Contacts> allContacts = contactService.getAllContacts();
		model.addAttribute("contacts", allContacts);
		return "list_contacts";
	}
}
