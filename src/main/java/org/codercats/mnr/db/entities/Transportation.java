package org.codercats.mnr.db.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Venu Babu Kolla.
 */
@Entity
@Table(name = "TRANSPORTATION")
public class Transportation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)")
    private BigInteger id;

    private String location;

    private BigDecimal price;

    public BigInteger getId() {
        return id;
    }

    public Transportation setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Transportation setLocation(String location) {
        this.location = location;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Transportation setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transportation that = (Transportation) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getLocation() != null ? !getLocation().equals(that.getLocation()) : that.getLocation() != null)
            return false;
        return getPrice() != null ? getPrice().equals(that.getPrice()) : that.getPrice() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
