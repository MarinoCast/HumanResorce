package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.City;
import org.OwlAgency.humanresorce.Model.Sector;
import org.OwlAgency.humanresorce.Payloads.Request.CityRequest;
import org.OwlAgency.humanresorce.Payloads.Request.SectorRequest;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;
import org.OwlAgency.humanresorce.Repository.CityRepository;
import org.OwlAgency.humanresorce.Repository.SectorRepository;
import org.OwlAgency.humanresorce.Services.CityServices;
import org.OwlAgency.humanresorce.Services.SectorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorServicesImpl implements SectorServices {
    @Autowired
    private SectorRepository sectorRepository;
    @Autowired
    private CityServices cityServices;

    public Sector findBy(Long id) {
        return this.sectorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Sector> findByCity(Long id) {
        return sectorRepository.findByCity_Id(id);
    }

    @Override
    public List<Sector> findAll() {
        return sectorRepository.findAll();
    }

}
