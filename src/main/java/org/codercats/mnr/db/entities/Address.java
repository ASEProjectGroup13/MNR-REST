package org.codercats.mnr.db.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Venu Babu Kolla.
 */
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)")
    private BigInteger id;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String country;

    private int zipcode;

    public BigInteger getId() {
        return id;
    }

    public Address setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public String getAddress1() { return address1; }

    public Address setAddress1(final String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress2() { return address2; }

    public Address setAddress2(final String address2) {
        this.address2 = address2;
        return this;
    }

    public String getCity() { return city; }

    public Address setCity(final String city) {
        this.city = city;
        return this;
    }

    public String getState() { return state; }

    public Address setSate(final String state) {
        this.state = state;
        return this;
    }

    public String getCountry() { return country; }

    public Address setCountry(final String country) {
        this.country = country;
        return this;
    }

    public int getZipcode() { return zipcode; }

    public Address setZipcode(final int zipcode) {
        this.zipcode = zipcode;
        return this;
    }
}
