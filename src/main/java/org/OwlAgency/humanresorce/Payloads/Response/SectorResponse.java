package org.OwlAgency.humanresorce.Payloads.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.OwlAgency.humanresorce.Model.Sector;

@Data
public class SectorResponse {
    private Long id;
    private String name;
    private ProvinceResponse city;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ProvinceResponse province;

    public SectorResponse(Sector sector) {
        this.id = sector.getId();
        this.name = sector.getName();
        this.city = new ProvinceResponse(sector.getProvince());
    }


    public static SectorResponse mapWithProvince(Sector sector) {
        SectorResponse response = new SectorResponse(sector);
        response.setProvince(new ProvinceResponse(sector.getProvince()));
        return response;

    }
}
