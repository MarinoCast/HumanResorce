package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.ContactInfo;
import org.OwlAgency.humanresorce.Model.Province;
import org.OwlAgency.humanresorce.Model.Sector;
import org.OwlAgency.humanresorce.Payloads.Request.ContactRequest;
import org.OwlAgency.humanresorce.Repository.ContactRepository;
import org.OwlAgency.humanresorce.Services.ContactService;
import org.OwlAgency.humanresorce.Services.ProvinceServices;
import org.OwlAgency.humanresorce.Services.SectorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ProvinceServices provinceServices;

    @Autowired
    private SectorServices sectorServices;

    @Override
    public ContactInfo create(ContactRequest contactRequest) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setNumber(contactRequest.getNumber());
        contactInfo.setPhone(contactRequest.getPhone());
        contactInfo.setStreet(contactRequest.getStreet());
        //Province
        Province province = provinceServices.find(contactRequest.getId());
        contactInfo.setProvince(province);
        //Sector
        Sector sector = sectorServices.find(contactRequest.getId());
        contactInfo.setSector(sector);
        contactRepository.save(contactInfo);
        return contactInfo;
    }

    @Override
    public ContactInfo findBy(Long id) {
        return contactRepository.findById(id).orElseThrow();
    }

    @Override
    public List<ContactInfo> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public ContactInfo update(ContactRequest request) {
        ContactInfo contactInfo = findBy(request.getId());
        contactInfo.setNumber(request.getNumber());
        contactInfo.setPhone(request.getPhone());
        contactInfo.setStreet(request.getStreet());
        //Province
        Province province = provinceServices.find(request.getId());
        contactInfo.setProvince(province);
        //Sector
        Sector sector = sectorServices.find(request.getId());
        contactInfo.setSector(sector);
        contactRepository.save(contactInfo);
        return contactInfo;
    }

    @Override
    public void delete(Long id) {
        ContactInfo contact = findBy(id);
        contactRepository.delete(contact);
    }
}
