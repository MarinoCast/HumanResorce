package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class SeguroMedicoRequest {
    private Long id;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;

}
