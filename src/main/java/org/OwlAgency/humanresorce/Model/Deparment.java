package org.OwlAgency.humanresorce.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "reg_deparment")
public class Deparment {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "COD_DEPART",length = 5,nullable = false)
    private String codDepart;

    @Column(name = "NAME",length = 100, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "REG_DOGS_OWNERS",
            joinColumns = @JoinColumn(name = "DOG_ID"),
            inverseJoinColumns = @JoinColumn(name = "MANAGER_ID"))
    private List<Employee> manager;
}