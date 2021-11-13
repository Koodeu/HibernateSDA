package entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "addresses")
public class Address extends BasicEntity{

    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "street")
    private String street;
    @Column(name = "street_no")
    private int streetNumber;
    @Column(name = "home_no")
    private int homeNumber;


}
