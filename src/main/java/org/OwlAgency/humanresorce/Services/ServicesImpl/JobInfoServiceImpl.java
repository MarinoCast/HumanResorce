package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.JobInfo;
import org.OwlAgency.humanresorce.Model.SeguroMedico;
import org.OwlAgency.humanresorce.Payloads.Request.JobInfoRequest;
import org.OwlAgency.humanresorce.Repository.JobInfoRepository;
import org.OwlAgency.humanresorce.Services.JobInfoService;
import org.OwlAgency.humanresorce.Services.SeguroMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInfoServiceImpl implements JobInfoService {
    @Autowired
    private JobInfoRepository jobInfoRepository;

    @Autowired
    private SeguroMedicoService seguroMedicoService;

    @Override
    public JobInfo create(JobInfoRequest request) {
        JobInfo jobInfo = new JobInfo();
        jobInfo.setCargo(request.getCargo());
        jobInfo.setSalary(request.getSalary());
        //SeguroMedico
        SeguroMedico seguro = seguroMedicoService.create(request.getSeguro());
        jobInfo.setSeguro(seguro);
        jobInfoRepository.save(jobInfo);
        return jobInfo;
    }

    @Override
    public JobInfo findBy(Long id) {
        return jobInfoRepository.findById(id).orElseThrow();
    }

    @Override
    public List<JobInfo> findAll() {
        return jobInfoRepository.findAll();
    }

    @Override
    public JobInfo update(JobInfoRequest jobInfoRequest) {
        JobInfo jobInfo = findBy(jobInfoRequest.getId());
        jobInfo.setCargo(jobInfoRequest.getCargo());
        jobInfo.setSalary(jobInfoRequest.getSalary());
        jobInfoRepository.save(jobInfo);
        return jobInfo;
    }

    @Override
    public List<JobInfo> getSalary(int salary) {

        return jobInfoRepository.findBySalary(salary);
    }

    @Override
    public List<JobInfo> getCargo(String name) {

        return jobInfoRepository.findByCargo(name);
    }

    @Override
    public void delete(Long id) {
        JobInfo jobInfo = findBy(id);
        jobInfoRepository.delete(jobInfo);
    }
}
