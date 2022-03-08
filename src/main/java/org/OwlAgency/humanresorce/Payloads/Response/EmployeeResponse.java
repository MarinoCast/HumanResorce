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
    private String edad;
    private String carrer;
    private SexResponse gender;
    private ContactResponse contactInfo;
    private JobInfoResponse jobInfo;

    public EmployeeResponse(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.lastName = employee.getLastName();
        this.edad = employee.getEdad();
        this.personalId = employee.getPersonalId();
        this.carrer = employee.getCarrear();
        this.gender = new SexResponse(employee.getSex());
       this.contactInfo = new ContactResponse(employee.getContactInfo());
       this.jobInfo = new JobInfoResponse(employee.getJobInfo());
    }

}
