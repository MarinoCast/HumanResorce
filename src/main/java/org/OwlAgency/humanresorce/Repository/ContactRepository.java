package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<ContactInfo, Long> {
    List<ContactInfo>findByStreet(String street);
    List<ContactInfo>findByPhone(String phone);
}
