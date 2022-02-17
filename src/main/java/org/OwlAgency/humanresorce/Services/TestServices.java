package org.OwlAgency.humanresorce.Services;

import org.OwlAgency.humanresorce.Model.Test;
import org.OwlAgency.humanresorce.Payloads.Request.TestRequest;

import java.util.List;

public interface TestServices {
    Test create(TestRequest testRequest);
    Test find(Long id);
    List<Test>findAll();
    Test update(TestRequest testRequest);
    void delete(Long id);
}
