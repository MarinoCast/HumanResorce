package org.OwlAgency.humanresorce.Controller;

import org.OwlAgency.humanresorce.Payloads.Response.ProvinceResponse;
import org.OwlAgency.humanresorce.Payloads.Response.CountryResponse;
import org.OwlAgency.humanresorce.Payloads.Response.SectorResponse;
import org.OwlAgency.humanresorce.Services.ProvinceServices;
import org.OwlAgency.humanresorce.Services.CountryServices;
import org.OwlAgency.humanresorce.Services.SectorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/location")
public class LocationController {
    @Autowired
    private SectorServices sectorService;
    @Autowired
    private ProvinceServices provinceService;
    @Autowired
    private CountryServices countryService;


    @GetMapping(value = "/province/",produces = "application/json")
    public ResponseEntity<List<ProvinceResponse>> findAllProvinces(){
        List<ProvinceResponse> provinces = this.provinceService.findAll()
                .stream().map(ProvinceResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(provinces);
    }

    @GetMapping(value = "/provice/municipality/",produces = "application/json")
    public ResponseEntity<List<SectorResponse>>findAllMunicipalities(){
        List<SectorResponse>sectors= this.sectorService.findAll().stream().map(SectorResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(sectors);
    }

    @GetMapping(value = "/province/{provinceId}/municipality/",produces = "application/json")
    public ResponseEntity<List<SectorResponse>> findProvinceMunicipalities(@PathVariable Long provinceId){
        List<SectorResponse> municipalities = this.sectorService.findByProvinceId(provinceId)
                .stream().map(SectorResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(municipalities);
    }

    @GetMapping(value = "/country/",produces = "application/json")
    public ResponseEntity<?> read(){
        List<CountryResponse> countryResponses =  countryService.findAll().stream().map(CountryResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(countryResponses);
    }


}
