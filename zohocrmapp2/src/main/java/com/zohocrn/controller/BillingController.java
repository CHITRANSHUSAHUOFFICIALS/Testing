package com.zohocrn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrn.entities.Billing;
import com.zohocrn.entities.Contacts;
import com.zohocrn.services.BillingService;
import com.zohocrn.services.ContactService;

@Controller
public class BillingController {
	 
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id,Model model) {
		Contacts contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing billing,Model model) {
		billingService.saveBill(billing);
		List<Billing> allBills = billingService.getAllBills();
		model.addAttribute("bills", allBills);
		return "list_bills";
	}
	
	@RequestMapping("/listBill")
	public String listAllBills(Model model) {
		List<Billing> allBills = billingService.getAllBills();
		model.addAttribute("bills", allBills);
		return "list_bills";
	}
}
