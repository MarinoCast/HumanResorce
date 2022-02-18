package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.City;
import org.OwlAgency.humanresorce.Model.Sector;

@Data
public class SectorResponse {
    private Long id;
    private String name;
    private CityResponse city;

    public SectorResponse(Sector sector){
        this.id = sector.getId();
        this.name = sector.getName();
        this.city = new CityResponse(sector.getCity());
    }

}
