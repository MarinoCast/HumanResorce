package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.Province;

@Data
public class ProvinceResponse {
    private Long id;
    private String name;

    public ProvinceResponse(Province province){
        this.id = province.getId();
        this.name = province.getName();
    }
}
