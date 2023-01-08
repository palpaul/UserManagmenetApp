package com.rahul.user_management.utils;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;



@Component
public class EmailUtils {
	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String to, String subject, String body) {
		
		boolean isSent = false;
		try {
			//simple msg class
			
			//SimpleMessage message = new SimpleMessage(); // in this we cant add the attatchhment 
			
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body,true);
			mailSender.send(mimeMessage);
			
			isSent = true;
			 
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		
		return isSent;
		
		
	}
	
}
