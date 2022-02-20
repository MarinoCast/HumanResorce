package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Country;
import org.OwlAgency.humanresorce.Payloads.Request.CountryRequest;

import java.util.List;

public interface CountryServices {
    Country create(CountryRequest countryRequest);
    Country find(Long id);
    List<Country>findAll();
    Country update(CountryRequest countryRequest);
    void delete(Long id);

}
