package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Payloads.Response.CityResponse;
import org.OwlAgency.humanresorce.Payloads.Response.SectorResponse;
import org.OwlAgency.humanresorce.Services.CityServices;
import org.OwlAgency.humanresorce.Services.SectorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/Lecation")
public class LocationController {
    @Autowired
    private SectorServices sectorService;
    @Autowired
    private CityServices cityService;




    @GetMapping(value = "city/{id}/sectors/",produces = "application/json")
    public ResponseEntity<?> read(@PathVariable Long id){
        List<SectorResponse> sectorResponses =  sectorService.findByCity(id).stream().map(SectorResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(sectorResponses);
    }

    @GetMapping("/city/")
    public ResponseEntity<?> readAll(){
        List<CityResponse> responses = cityService.findAll().stream().map(CityResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }


}
