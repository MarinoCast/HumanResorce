package org.OwlAgency.humanresorce.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.OwlAgency.humanresorce.Model.Enums.SeguroMedico;

import javax.persistence.*;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="JOB_INFO")
public class JobInfo {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SALARY", length = 100, nullable = false)
    private int salary;

    @Column(name ="CARGO", length = 100, nullable = false)
    private String cargo;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEGUROMEDICO", nullable = false)
    private SeguroMedico seguroMedico;



}
