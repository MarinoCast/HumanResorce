package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Model.Employee;
import org.OwlAgency.humanresorce.Payloads.Request.EmployeeRequest;
import org.OwlAgency.humanresorce.Payloads.Response.EmployeeResponse;
import org.OwlAgency.humanresorce.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping("/")
    public ResponseEntity<?> create(@Valid @RequestBody EmployeeRequest employeeRequest){
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeServices.create(employeeRequest));
        return ResponseEntity.ok(employeeResponse);
    }
    @GetMapping(value = "/{id}",produces = "application/json")
    public ResponseEntity<?>read(@PathVariable Long id){
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeServices.find(id));
        return ResponseEntity.ok(employeeResponse);
    }
    @GetMapping("/")
    public ResponseEntity<?> readAll(){
        List<EmployeeResponse> responses = employeeServices.findAll().stream().map(EmployeeResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
    @PutMapping(value ="/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody EmployeeRequest employeeRequest){
        employeeRequest.setId(id);
        Employee employee = employeeServices.update(employeeRequest);
        return ResponseEntity.ok(new EmployeeResponse(employee));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        employeeServices.delete(id);
        return ResponseEntity.ok("Borrado");
    }
}
