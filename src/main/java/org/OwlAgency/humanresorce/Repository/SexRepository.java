package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.Sex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SexRepository extends JpaRepository<Sex,Long>{
}
