package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Model.ContactInfo;
import org.OwlAgency.humanresorce.Payloads.Request.ContactRequest;
import org.OwlAgency.humanresorce.Payloads.Response.ContactResponse;
import org.OwlAgency.humanresorce.Services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api/contact")
public class ContactInfoController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/")
    public ResponseEntity<?> create(@Valid @RequestBody ContactRequest contactRequest){
        ContactResponse contactResponse = new ContactResponse(contactService.create(contactRequest));
        return ResponseEntity.ok(contactResponse);
    }

    @GetMapping("/")
    public ResponseEntity<?> readAll(){
        List<ContactResponse> responses = contactService.findAll().stream().map(ContactResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

}
