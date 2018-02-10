package org.codercats.mnr.db.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Venu Babu Kolla.
 */
@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)")
    private BigInteger id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String alias;

    private String email;

    private String locationId;

    private String addressId;

    private String userType;

    public BigInteger getId() {
        return id;
    }

    public Person setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public String getFirstName() { return firstName; }

    public Person setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() { return lastName; }

    public Person setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public Person setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getAlias() { return alias; }

    public Person setAlias(final String alias) {
        this.alias = alias;
        return this;
    }

    public String getEmail() { return email; }

    public Person setEmail(final String email) {
        this.email = email;
        return this;
    }

    public String getLocationId() { return locationId; }

    public Person setLocationId(final String locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getAddressId() { return addressId; }

    public Person setAddressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public String getUserType() { return userType; }

    public Person setUserType(final String userType) {
        this.userType = userType;
        return this;
    }
}
