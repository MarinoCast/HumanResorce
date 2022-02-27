package org.OwlAgency.humanresorce.Payloads.Request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class JobInfoRequest {
    private Long id;

    @NotNull
    private int salary;

    @NotBlank
    @Size(min = 3, max = 100)
    private String cargo;

    private Set<String> seguromedicos;
}
