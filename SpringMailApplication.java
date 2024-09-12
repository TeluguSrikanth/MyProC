package com.mhr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringMailApplication {

	@Autowired
	private EmailSenderService emailSenderService;
	
    @EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException{
		emailSenderService.sendEmailWithAttachment("srikanthjava57@gmail.com",
				 "This is email body.",
	                "This email subject", "" +
           "C:\\Users\\SRIKANTH\\Desktop\\Sk Resu\\Srikanth_Java_Developer_Resume_,.pdf");
	}
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMailApplication.class, args);
	}

}



// Hello People
// Good Morning
