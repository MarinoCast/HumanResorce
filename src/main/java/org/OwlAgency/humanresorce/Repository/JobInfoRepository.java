package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobInfoRepository extends JpaRepository<JobInfo,Long> {
    List<JobInfo>findByCargo(String name);
    List<JobInfo>findBySalary(int salary);


}
