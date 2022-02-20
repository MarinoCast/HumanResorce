package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.Sector;
import org.OwlAgency.humanresorce.Repository.SectorRepository;
import org.OwlAgency.humanresorce.Services.ProvinceServices;
import org.OwlAgency.humanresorce.Services.SectorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorServicesImpl implements SectorServices {

    @Autowired
    private SectorRepository sectorRepository;


    @Override
    public Sector find(Long id) {
        return sectorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Sector> findAll() {
        return sectorRepository.findAll();
    }

    @Override
    public List<Sector> findByProvinceId(Long provinceId) {
        return this.sectorRepository.findByProvince_Id(provinceId);
    }
}
