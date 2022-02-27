package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Province;

import java.util.List;

public interface ProvinceServices {
    List<Province>findAll();
   Province find(Long id);
}
