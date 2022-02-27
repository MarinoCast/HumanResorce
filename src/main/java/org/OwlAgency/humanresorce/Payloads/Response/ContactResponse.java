package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.ContactInfo;

@Data
public class ContactResponse {
    private Long id;
    private String phone;
    private String street;
    private String number;
    private ProvinceResponse city;
    private SectorResponse municipality;

    public ContactResponse(ContactInfo contact){
        this.id = contact.getId();
        this.phone = contact.getPhone();
        this.street = contact.getStreet();
        this.number = contact.getNumber();
        this.city = new ProvinceResponse(contact.getProvince());
        this.municipality = new SectorResponse(contact.getSector());

    }

}
