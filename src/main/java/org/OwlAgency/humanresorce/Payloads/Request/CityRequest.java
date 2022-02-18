package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CityRequest {
    private  Long id;

    @NotBlank
    @Size(min = 5, max = 100)
    private String name;
}
