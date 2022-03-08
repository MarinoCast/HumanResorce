package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.Sex;

@Data
public class SexResponse {
    private Long id;
    private String name;

    public SexResponse(Sex sex){
        this.id = sex.getId();
        this.name = sex.getName();
    }
}
