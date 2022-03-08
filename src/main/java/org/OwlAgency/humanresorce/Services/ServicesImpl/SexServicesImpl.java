package org.OwlAgency.humanresorce.Services.ServicesImpl;
import org.OwlAgency.humanresorce.Model.Sex;
import org.OwlAgency.humanresorce.Payloads.Request.SexRequest;
import org.OwlAgency.humanresorce.Repository.SexRepository;
import org.OwlAgency.humanresorce.Services.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexServicesImpl implements SexService {

    @Autowired
    private SexRepository sexRepository;

    @Override
    public Sex create(SexRequest sexRequest) {
        Sex sex = new Sex();
        sex.setName(sexRequest.getName());
        sexRepository.save(sex);
        return sex;
    }

    @Override
    public Sex find(Long id) {
        return sexRepository.findById(id).orElseThrow();
    }
}
