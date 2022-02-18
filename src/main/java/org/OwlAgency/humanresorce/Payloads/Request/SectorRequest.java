package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class SectorRequest {
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private Long cityid;
}
