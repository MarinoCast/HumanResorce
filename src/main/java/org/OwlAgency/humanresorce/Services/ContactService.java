package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.ContactInfo;
import org.OwlAgency.humanresorce.Payloads.Request.ContactRequest;

import java.util.List;

public interface ContactService {
    ContactInfo create(ContactRequest contactRequest);
    ContactInfo findBy(Long id);
    List<ContactInfo>findAll();
    ContactInfo update(ContactRequest contactRequest);
    void delete(Long id);
}
