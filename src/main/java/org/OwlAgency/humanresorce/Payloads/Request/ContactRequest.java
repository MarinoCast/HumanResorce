package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ContactRequest {
    private Long id;

    @NotNull
    @Size(max = 10)
    private String phone;

    @NotNull
    @Size(min = 3, max = 100)
    private String street;

    @NotNull
    private String number;

    @NotNull
    private  Long sectorId;

}
