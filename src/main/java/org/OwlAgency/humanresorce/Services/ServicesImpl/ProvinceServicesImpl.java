package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.Province;
import org.OwlAgency.humanresorce.Repository.ProvinceRepository;
import org.OwlAgency.humanresorce.Services.ProvinceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServicesImpl implements ProvinceServices {
    @Autowired
    private ProvinceRepository provinceRepository;


    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province find(Long id) {
        return provinceRepository.findById(id).orElseThrow();
    }

}
