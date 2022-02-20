package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
