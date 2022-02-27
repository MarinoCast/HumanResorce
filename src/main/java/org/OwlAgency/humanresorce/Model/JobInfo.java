package org.OwlAgency.humanresorce.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="REG_JOB_INFO")
public class JobInfo {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SALARY", length = 100, nullable = false)
    private int salary;

    @Column(name ="CARGO", length = 100, nullable = false)
    private String cargo;

    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "SEGURO_MEDICO_ID", nullable = false)
    private SeguroMedico seguro;



}
