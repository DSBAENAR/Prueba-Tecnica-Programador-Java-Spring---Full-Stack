package com.programmedemails.appcore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmedemails.appcore.model.Contact;
import com.programmedemails.appcore.repository.ContactRepository;

@Service
public class ContactServices {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    public void addContact(Contact contact){
        contactRepository.save(contact);
    }
}
