package org.OwlAgency.humanresorce.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name="REG_CONTACT_INFO")
public class ContactInfo {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phone;

    private String street;

    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CITY_ID", nullable = false)
    private Province province;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SECTOR_ID", nullable = false)
    private Sector sector;
}
