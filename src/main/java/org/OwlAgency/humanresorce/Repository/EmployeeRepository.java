package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee>findByName(String name);
    List<Employee>findByLastName(String Lastname);
}
