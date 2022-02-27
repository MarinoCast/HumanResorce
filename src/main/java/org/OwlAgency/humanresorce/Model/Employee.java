package org.OwlAgency.humanresorce.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity(name="REG_EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "LASTNAME", length = 100, nullable = false)
    private String lastName;

    @Column(name = "PERSONAL_ID", length = 12, nullable = false)
    private String personalId;

    @Column(name = "EDAD", length = 25, nullable = false)
    private int edad;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEX_ID", nullable = false)
    private Sex gender;

    @Column(name = "CARREAR", length = 100, nullable = false)
    private String carrear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_INFO_ID", nullable = false)
    private ContactInfo contactInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="JOB_INFO_ID", nullable = false)
    private JobInfo jobInfo;
}
