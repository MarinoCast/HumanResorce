package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Sex;
import org.OwlAgency.humanresorce.Payloads.Request.SexRequest;

public interface SexService {
    Sex create(SexRequest sexRequest);
    Sex find(Long id);

}
