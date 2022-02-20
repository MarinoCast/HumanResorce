package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    List<Country>findCountryByName(String name);


}
