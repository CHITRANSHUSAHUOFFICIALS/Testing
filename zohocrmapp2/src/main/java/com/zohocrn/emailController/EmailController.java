package com.zohocrn.emailController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrn.util.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@PostMapping("/bhejoEmail")
	public String bhejoEmail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("body") String body,Model model) {
		emailService.sendMail(to, sub, body); 
		model.addAttribute("msg", "Email is sended");
		return "compose_email";
	}
}
