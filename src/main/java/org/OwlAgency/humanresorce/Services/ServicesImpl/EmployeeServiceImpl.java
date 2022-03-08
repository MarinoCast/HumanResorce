package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.ContactInfo;
import org.OwlAgency.humanresorce.Model.Employee;
import org.OwlAgency.humanresorce.Model.JobInfo;
import org.OwlAgency.humanresorce.Model.Sex;
import org.OwlAgency.humanresorce.Payloads.Request.EmployeeRequest;
import org.OwlAgency.humanresorce.Repository.EmployeeRepository;
import org.OwlAgency.humanresorce.Services.ContactService;
import org.OwlAgency.humanresorce.Services.EmployeeServices;
import org.OwlAgency.humanresorce.Services.JobInfoService;
import org.OwlAgency.humanresorce.Services.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ContactService contactInfoService;

    @Autowired
    private JobInfoService jobInfoService;

    @Autowired
    private SexService sexService;

    @Override
    public Employee create(EmployeeRequest request) {
       //SET ALL THE INFORMATION OF THE EMPLOYEES
       Employee employee = new Employee();
       employee.setName(request.getName());
       employee.setLastName(request.getLastName());
       employee.setEdad(request.getEdad());
       employee.setPersonalId(request.getPersonalId());
       employee.setCarrear(request.getCarrear());
    //SETTING CONTACT, JOB AND SEX REQUEST
        Sex sex = sexService.create(request.getGender());
        employee.setSex(sex);

        ContactInfo contact = contactInfoService.create(request.getContactInfo());
        employee.setContactInfo(contact);

        JobInfo job = jobInfoService.create(request.getJobInfo());
        employee.setJobInfo(job);

        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee find(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();

    }

    @Override
    public Employee update(EmployeeRequest request) {

        //SET ALL THE INFORMATION OF THE EMPLOYEES
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setLastName(request.getLastName());
        employee.setEdad(request.getEdad());
        employee.setPersonalId(request.getPersonalId());
        employee.setCarrear(request.getCarrear());
        //SETTING CONTACT, JOB AND SEX REQUEST
        Sex sex = sexService.create(request.getGender());
        employee.setSex(sex);

        ContactInfo contact = contactInfoService.create(request.getContactInfo());
        employee.setContactInfo(contact);

        JobInfo job = jobInfoService.create(request.getJobInfo());
        employee.setJobInfo(job);

        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void delete(Long id) {
        Employee employee = find(id);
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findByName(String name)
    {
        return null;
    }

    @Override
    public Employee findByLastName(String lastName) {
        return null;
    }
}
