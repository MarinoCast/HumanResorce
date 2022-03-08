package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class EmployeeRequest {
    private Long id;

    @NotBlank
    @Size(min= 3, max = 100)
    private String name;

    @NotBlank
    @Size(min = 3, max = 100)
    private String lastName;

    @NotNull
    @Size(min = 3, max = 12)
    private String personalId;

    @NotNull
    private String edad;

    @NotBlank
    @Size(min= 3, max = 50)
    private String carrear;

    @Valid
    private  SexRequest gender;

    @Valid
    private ContactRequest contactInfo;

    @Valid
    private JobInfoRequest jobInfo;


}
