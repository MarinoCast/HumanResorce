package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Model.Test;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;
import org.OwlAgency.humanresorce.Payloads.Response.TestResponse;
import org.OwlAgency.humanresorce.Services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestServices testServices;

    @PostMapping("/")
    public ResponseEntity<?> create(@Valid @RequestBody TestRequest testRequest){
        TestResponse testResponse = new TestResponse(testServices.create(testRequest));
        return ResponseEntity.ok(testResponse);
    }
    @GetMapping(value ="/{id}",produces = "application/json")
    public ResponseEntity<?> read(@PathVariable Long id){
        TestResponse testResponse = new TestResponse(testServices.find(id));
        return ResponseEntity.ok(testResponse);
    }
    @GetMapping("/")
    public ResponseEntity<?> readAll(){
        List<TestResponse> responses = testServices.findAll().stream().map(TestResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
    @PutMapping(value ="/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody TestRequest testRequest){
        testRequest.setId(id);
        Test test = testServices.update(testRequest);
        return ResponseEntity.ok(new TestResponse(test));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        testServices.delete(id);
        return ResponseEntity.ok("Borrado");
    }
}
