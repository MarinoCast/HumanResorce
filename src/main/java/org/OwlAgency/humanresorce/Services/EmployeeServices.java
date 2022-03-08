package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Employee;
import org.OwlAgency.humanresorce.Payloads.Request.EmployeeRequest;

import java.util.List;

public interface EmployeeServices {
    Employee create(EmployeeRequest request);
    Employee find(Long id);
    List<Employee>findAll();
    Employee update(EmployeeRequest request);
    void delete(Long id);
    Employee findByName(String name);
    Employee findByLastName(String lastName);

}
