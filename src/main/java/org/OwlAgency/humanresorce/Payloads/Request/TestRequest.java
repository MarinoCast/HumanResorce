package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class TestRequest {
    private Long id;

    @NotBlank
    @Size(min =3, max=100)
    private String name;

    @NotBlank
    @Size(min =3, max=100)
    private String description;

}
