package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Sector;

import java.util.List;

public interface SectorServices {
    Sector find(Long id);
    List<Sector>findAll();
    List<Sector> findByProvinceId(Long provinceId);


}
