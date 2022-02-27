package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.Employee;
import org.OwlAgency.humanresorce.Model.Sex;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private String lastName;
    private String personalId;
    private int edad;
    private ContactResponse contactInfo;
    private JobInfoResponse jobInfoResponse;

    public EmployeeResponse(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.lastName = employee.getLastName();
        this.edad = employee.getEdad();
        this.contactInfo = new ContactResponse(employee.getContactInfo());
    }

}
