package org.codercats.mnr.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigInteger;

@Entity
@Table(name = "VEGETABLE")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)", name = "id")
    private BigInteger id;

    @Column(name = "vegetable_name")
    private String name;

    @Column(name = "unit")
    private String unit;

    public BigInteger getId(){
        return id;
    }
    public Vegetable setId(final BigInteger id) {
        this.id = id;
        return this;
    }

    public String getName(){
        return name;
    }

    public Vegetable setName(final String vegatableName){
        this.name = name;
        return this;
    }

    public String getUnit(){
        return unit;
    }

    public Vegetable setUnit(final String unit){
        this.unit = unit;
        return this;
    }

    @Override
    public boolean equals (Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Vegetable))
        {
            return false;
        }

        Vegetable vegetable = (Vegetable) o;

        if (!getId().equals(vegetable.getId()))
        {
            return false;
        }
        if (!getName().equals(vegetable.getName()))
        {
            return false;
        }
        return getUnit().equals(vegetable.getUnit());
    }

    @Override
    public int hashCode ()
    {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getUnit().hashCode();
        return result;
    }

    @Override
    public String toString ()
    {
        return "Vegetable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
