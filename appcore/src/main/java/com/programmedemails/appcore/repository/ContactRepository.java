package com.programmedemails.appcore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programmedemails.appcore.model.Contact;
public interface ContactRepository extends MongoRepository<Contact,String>{

} 
    
