package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Sector;
import org.OwlAgency.humanresorce.Model.Test;
import org.OwlAgency.humanresorce.Payloads.Request.CityRequest;
import org.OwlAgency.humanresorce.Payloads.Request.SectorRequest;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;

import java.util.List;

public interface SectorServices {
    Sector findBy(Long id);
    List<Sector> findByCity(Long id);
    List<Sector> findAll();

}
