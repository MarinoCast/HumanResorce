package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.SeguroMedico;

@Data
public class SeguroMedicoResponse {
    private Long id;
    private String name;

    public  SeguroMedicoResponse(SeguroMedico seguro){
        this.id = seguro.getId();
        this.name = seguro.getName();
    }
}
