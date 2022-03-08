package org.OwlAgency.humanresorce.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="REG_Province")
public class Province {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NAME", length = 100, nullable = false, unique = true)
    private String name;


    @OneToMany(mappedBy = "province", fetch = FetchType.LAZY)
    private Set<Sector> sector;

}
