package com.programmedemails.appcore.services;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private final JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public String sendEmailToOne(String to, String subject, String body) throws MailException{

            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo(to);
            
            msg.setSubject(subject);

            msg.setText(body);

            msg.setFrom("dsbanaenar.com");

            mailSender.send(msg);
            
            return "Mail sent succesfully";


    }

}
