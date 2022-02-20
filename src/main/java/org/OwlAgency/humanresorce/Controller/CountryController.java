package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Model.Country;
import org.OwlAgency.humanresorce.Payloads.Request.CountryRequest;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;
import org.OwlAgency.humanresorce.Payloads.Response.CountryResponse;
import org.OwlAgency.humanresorce.Payloads.Response.TestResponse;
import org.OwlAgency.humanresorce.Services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/Country")
public class CountryController {
    @Autowired
    private CountryServices countryServices;

    @PostMapping("/")
    public ResponseEntity<?> create(@Valid @RequestBody CountryRequest countryRequest){
        CountryResponse countryResponse = new CountryResponse(countryServices.create(countryRequest));
        return ResponseEntity.ok(countryResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>update(@PathVariable Long id, @RequestBody CountryRequest countryRequest){
        countryRequest.setId(id);
        Country country = countryServices.update(countryRequest);
        return ResponseEntity.ok(new CountryResponse(country));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        countryServices.delete(id);
        return ResponseEntity.ok("Borrado");
    }
}
