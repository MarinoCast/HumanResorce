package org.OwlAgency.humanresorce.Payloads.Response;

import lombok.Data;
import org.OwlAgency.humanresorce.Model.JobInfo;
import org.OwlAgency.humanresorce.Model.SeguroMedico;
import org.OwlAgency.humanresorce.Model.Sex;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class JobInfoResponse {
    private Long id;
    private int salary;
    private String cargo;
    private SeguroMedicoResponse seguro;

    public JobInfoResponse(JobInfo jobInfo){
        this.id = jobInfo.getId();
        this.salary = jobInfo.getSalary();
        this.cargo = jobInfo.getCargo();
        this.seguro = new SeguroMedicoResponse(jobInfo.getSeguro());
    }

}
