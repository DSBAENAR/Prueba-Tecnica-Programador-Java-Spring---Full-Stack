package com.programmedemails.appcore.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.programmedemails.appcore.model.Contact;
import com.programmedemails.appcore.services.ContactServices;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController()
@RequestMapping("/api")
public class ContactController {

    private final ContactServices contactServices;
    
    public ContactController(ContactServices contactServices){
        this.contactServices = contactServices;
    }

    @GetMapping("/get/contacts")
    public List<Contact> getMethodName() {
        List<Contact> contacts = contactServices.getContacts();
        return contacts;
    }

    @PostMapping("/add/contact")
    public void postMethodName(@RequestBody Contact contact) {
        contactServices.addContact(contact);
    }
    


    
}
