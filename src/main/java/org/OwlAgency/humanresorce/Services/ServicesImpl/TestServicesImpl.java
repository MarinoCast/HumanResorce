package org.OwlAgency.humanresorce.Services.ServicesImpl;

import org.OwlAgency.humanresorce.Model.Test;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;
import org.OwlAgency.humanresorce.Repository.TestRepository;
import org.OwlAgency.humanresorce.Services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServicesImpl implements TestServices {
    @Autowired
    private TestRepository testRepository;

    @Override
    public Test create(TestRequest request) {
       Test test = new Test();
       test.setName(request.getName());
       test.setDescription(request.getDescription());
       testRepository.save(test);
        return test;
    }

    @Override
    public Test find(Long id) {
        return testRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Test> findAll() {
        return testRepository.findByDeletedIsFalse();
    }

    @Override
    public Test update(TestRequest request) {
        Test test = find(request.getId());
        test.setName(request.getName());
        test.setDescription(request.getDescription());
        testRepository.save(test);
        return test;
    }

    @Override
    public void delete(Long id) {
        Test test = find(id);
        testRepository.delete(test);
    }
}
