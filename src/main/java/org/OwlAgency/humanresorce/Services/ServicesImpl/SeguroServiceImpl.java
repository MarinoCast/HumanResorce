package org.OwlAgency.humanresorce.Services.ServicesImpl;


import org.OwlAgency.humanresorce.Model.SeguroMedico;
import org.OwlAgency.humanresorce.Payloads.Request.SeguroMedicoRequest;
import org.OwlAgency.humanresorce.Repository.SeguroMedicoRepository;
import org.OwlAgency.humanresorce.Services.SeguroMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SeguroServiceImpl implements SeguroMedicoService {

    @Autowired
    private SeguroMedicoRepository seguroMedicoRepository;


    @Override
    public SeguroMedico create(SeguroMedicoRequest request) {
        SeguroMedico seguro = new SeguroMedico();
        seguro.setName(request.getName());
        seguroMedicoRepository.save(seguro);
        return seguro;
    }

    @Override
    public SeguroMedico findBy(Long id) {
        return seguroMedicoRepository.findById(id).orElseThrow();
    }



}
