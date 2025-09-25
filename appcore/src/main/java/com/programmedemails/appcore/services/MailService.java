package com.programmedemails.appcore.services;

import java.util.List;

import com.mailersend.sdk.MailerSend;
import com.mailersend.sdk.MailerSendResponse;
import com.mailersend.sdk.emails.Email;
import com.mailersend.sdk.exceptions.MailerSendException;
import com.programmedemails.appcore.model.Contact;


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

        ms.setToken("mlsn.1d2e5833287778c3ac0b6eafe078719296dd743bdcf0477e996fe9a16ab03d4d");

        try {    
        MailerSendResponse response = ms.emails().send(email);
        System.out.println(response.messageId);
        } catch (MailerSendException e) {
            e.printStackTrace();
        }
    }
}
