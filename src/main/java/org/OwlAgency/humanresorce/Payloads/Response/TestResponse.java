package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.Test;

@Data
public class TestResponse {
    private Long id;
    private String name;
    private String description;


    public TestResponse(Test test){
        this.id = test.getId();
        this.name = test.getName();
        this.description = test.getDescription();
    }
}
