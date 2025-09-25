package com.programmedemails.appcore.model;

import java.time.LocalDateTime;
import java.util.List;

public class CronJob {
    private LocalDateTime sendDateTime;
    private String title;
    private String description;
    List<Contact> contacts;

    public CronJob(LocalDateTime sendDateTime, String title, String description, List<Contact> contacts) {
        this.sendDateTime = sendDateTime;
        this.title = title;
        this.description = description;
        this.contacts = contacts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }



    public LocalDateTime getSendDateTime() {
        return sendDateTime;
    }



    public void setSendDateTime(LocalDateTime sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    
    

}
