package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.City;

@Data
public class CityResponse {
    private Long id;
    private String name;

    public CityResponse(City city){
        this.id = city.getId();
        this.name = city.getName();
    }
}
