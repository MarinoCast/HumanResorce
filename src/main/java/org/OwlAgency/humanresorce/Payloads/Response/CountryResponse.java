package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.Country;

@Data
public class CountryResponse {
    private Long id;
    private String name;

    public CountryResponse(Country country){
        this.id = country.getId();
        this.name = country.getName();
    }

}
