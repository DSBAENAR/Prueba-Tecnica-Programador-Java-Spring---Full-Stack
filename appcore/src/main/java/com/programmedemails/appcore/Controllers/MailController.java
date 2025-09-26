package com.programmedemails.appcore.Controllers;

import org.springframework.web.bind.annotation.RestController;
import com.programmedemails.appcore.DTO.EmailRequest;
import com.programmedemails.appcore.services.MailService;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/programmedmail")
public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) { 
        this.mailService = mailService; 
    }


    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
        try {
            return ResponseEntity.ok(mailService.sendEmail(request.getTo(),request.getSubject(),request.getBody()));
        } catch (MailException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Collections.singletonMap("message: ",e.getMessage()));
        }
        
    }
    
}
