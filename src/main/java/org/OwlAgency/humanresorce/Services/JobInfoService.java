package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.JobInfo;
import org.OwlAgency.humanresorce.Payloads.Request.JobInfoRequest;

import java.util.List;

public interface JobInfoService {
    JobInfo create(JobInfoRequest jobInfoRequest);
    JobInfo findBy(Long id);
    List<JobInfo> findAll();
    JobInfo update(JobInfoRequest jobInfoRequest);
    List<JobInfo> getSalary(int salary);
    List<JobInfo> getCargo(String name);
    void delete(Long id);


}
