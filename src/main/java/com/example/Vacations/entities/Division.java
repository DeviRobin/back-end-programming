package com.example.Vacations.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="divisions")
@Getter
@Setter
public class Division {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long id;

    @Column(name = "division")
    private String division_name;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
    private Country country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer>customers = new HashSet<>();

    @Column(name = "country_id")
    private Long country_id;
    public void setCountry(Country country) {
        setCountry_id((country.getId()));
        this.country = country;
    }
    /*@ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "country_id", insertable = false, updatable = false)
    private Long countryID;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Customer> customers;

   public void setCountry(Country country) {
        this.country = country;
        this.countryID = (country != null) ? country.getId() : null;} */
}
