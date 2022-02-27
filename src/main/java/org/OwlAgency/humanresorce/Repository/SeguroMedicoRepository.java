package org.OwlAgency.humanresorce.Repository;

import org.OwlAgency.humanresorce.Model.SeguroMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeguroMedicoRepository extends JpaRepository<SeguroMedico,Long> {
    List<SeguroMedico> findByName(String name);

}
