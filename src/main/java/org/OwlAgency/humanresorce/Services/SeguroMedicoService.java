package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.SeguroMedico;
import org.OwlAgency.humanresorce.Payloads.Request.SeguroMedicoRequest;

import java.util.List;
import java.util.Set;

public interface SeguroMedicoService {
    SeguroMedico create(SeguroMedicoRequest request);
    SeguroMedico findBy(Long id);
}
