package org.EmailTrigger.controller;

import javax.mail.MessagingException;

import org.EmailTrigger.Email;
import org.EmailTrigger.service.EmailTriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailTriggerController {
	
	@Autowired
	EmailTriggerService emailTriggerService;
	
	@RequestMapping(method=RequestMethod.POST,value="/sendMail")
	public String sendMail(@RequestBody Email mail) throws MessagingException {
		
		emailTriggerService.senMail(mail);
		return "Email sent successfully";
		
		
	}

}
