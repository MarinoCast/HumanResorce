package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.Country;
import org.OwlAgency.humanresorce.Payloads.Request.CountryRequest;
import org.OwlAgency.humanresorce.Repository.CountryRepository;
import org.OwlAgency.humanresorce.Services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServicesImpl implements CountryServices {
    @Autowired
    private CountryRepository countryRepository;


    @Override
    public Country create(CountryRequest request) {
        Country country = new Country();
        country.setName(request.getName());
        countryRepository.save(country);
        return country;
    }

    @Override
    public Country find(Long id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country update(CountryRequest request) {
        Country country = find(request.getId());
        country.setName(request.getName());
        countryRepository.save(country);
        return country;
    }

    @Override
    public void delete(Long id) {
        Country country = find(id);
        countryRepository.delete(country);

    }
}
