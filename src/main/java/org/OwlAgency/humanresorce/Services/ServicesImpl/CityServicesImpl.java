package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.City;
import org.OwlAgency.humanresorce.Model.Sector;
import org.OwlAgency.humanresorce.Payloads.Request.CityRequest;
import org.OwlAgency.humanresorce.Repository.CityRepository;
import org.OwlAgency.humanresorce.Repository.SectorRepository;
import org.OwlAgency.humanresorce.Services.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServicesImpl implements CityServices {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public City find(Long id) {
        return cityRepository.findById(id).orElseThrow();
        }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

}
