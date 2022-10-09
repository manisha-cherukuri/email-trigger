package org.EmailTrigger.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.EmailTrigger.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailTriggerService {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String fromMail;
	
	public void senMail(Email mail) throws MessagingException {
		
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true);
		mimeMessageHelper.setFrom(fromMail);
		mimeMessageHelper.addTo(mail.getToMail());
		mimeMessageHelper.setText(mail.getBody());
		mimeMessageHelper.setSubject(mail.getSubject());
		
		FileSystemResource fileSystemResource=new FileSystemResource(new File(mail.getAttachmentPath()));
		
		mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
		javaMailSender.send(mimeMessage);
		
	}
}
