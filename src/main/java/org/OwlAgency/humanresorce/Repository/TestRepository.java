package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test>findByName(String name);
    List<Test> findByDeletedIsFalse();

}
