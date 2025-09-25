package com.programmedemails.appcore.services;

import java.util.List;

import com.mailersend.sdk.MailerSend;
import com.mailersend.sdk.MailerSendResponse;
import com.mailersend.sdk.emails.Email;
import com.mailersend.sdk.exceptions.MailerSendException;
import com.programmedemails.appcore.model.Contact;

import io.github.cdimascio.dotenv.Dotenv;


public class MailService {
    private final Contact contact;

    public MailService(Contact contact) {
        this.contact = contact;
    }

    public void sendEmail(String from, String emailFrom ,String to, List<Contact> contacts ){
        Email email = new Email();
        MailerSend ms = new MailerSend();
        email.setFrom(from,emailFrom);
        email.addRecipient(from, to);

        for (Contact cont: contacts){
            email.addRecipient(cont.getFirstName() + cont.getLastname(), cont.getEmail());
        }

        email.setSubject("Subject:");
        email.setHtml("<p>Mensaje de prueba</p>");

        ms.setToken(Dotenv.load().get("API_KEY"));

        try {    
        MailerSendResponse response = ms.emails().send(email);
        System.out.println(response.messageId);
        } catch (MailerSendException e) {
            e.printStackTrace();
        }
    }
}
