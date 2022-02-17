package org.OwlAgency.humanresorce.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity(name = "REG_JOBS_HISTORY")
public class Jobs_History {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOBS_INFO_ID")
    private JobInfo jobs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARMENT_ID")
    private Deparment deparment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    @Column(name = "HIRE_DATE", columnDefinition = "DATE", nullable = false)
    private LocalDate hireDate;

    @Column(name = "FIRE_DATE", columnDefinition = "DATE")
    private LocalDate fireDate;
}
