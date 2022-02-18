package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.City;
import org.OwlAgency.humanresorce.Payloads.Request.CityRequest;

import java.util.List;

public interface CityServices {
    City find(Long id);
    List<City>findAll();
}
