package org.codercats.mnr.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)", name = "id")
    private BigInteger id;

    @Column(name = "person_id")
    private BigInteger personId;

    @Column(name = "vegetable_id")
    private BigInteger vegetableId;

    @Column(name = "vegetable_quantity")
    private BigDecimal vegetableQuantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "bag_quantity")
    private int bagQuantity;

    @Column(name = "transaction_date")
    private Date transactionDate;

    public BigInteger getPersonId ()
    {
        return personId;
    }

    public Transaction setPersonId(final BigInteger personId){
        this.personId = personId;
        return this;
    }

    public BigInteger getVegetableId ()
    {
        return vegetableId;
    }

    public Transaction setVegetableId(final BigInteger vegetableId) {
        this.vegetableId = vegetableId;
        return this;
    }

    public BigDecimal getUnitPrice ()
    {
        return unitPrice;
    }

    public Transaction setUnitPrice(final BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public BigDecimal getVegetableQuantity (){
        return vegetableQuantity;
    }

    public Transaction setVegetableQuantity(final BigDecimal vegetableQuantity) {
        this.vegetableQuantity = vegetableQuantity;
        return this;
    }

    public BigDecimal getTotalAmount ()
    {
        return totalAmount;
    }

    public Transaction setTotalAmount(final BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public int getBagQuantity(){
        return bagQuantity;
    }

    public Transaction setBagQuantity(final int bagQuantity){
        this.bagQuantity = bagQuantity;
        return this;
    }

    public Date getTransactionDate(){
        return transactionDate;
    }

    public Transaction setTransactionDate(final Date transactionDate){
        this.transactionDate = transactionDate;
        return this;
    }

    @Override
    public boolean equals (Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Transaction))
        {
            return false;
        }

        Transaction that = (Transaction) o;

        if (getBagQuantity() != that.getBagQuantity())
        {
            return false;
        }
        if (!id.equals(that.id))
        {
            return false;
        }
        if (!getPersonId().equals(that.getPersonId()))
        {
            return false;
        }
        if (!getVegetableId().equals(that.getVegetableId()))
        {
            return false;
        }
        if (!getVegetableQuantity().equals(that.getVegetableQuantity()))
        {
            return false;
        }
        if (!getUnitPrice().equals(that.getUnitPrice()))
        {
            return false;
        }
        if (!getTotalAmount().equals(that.getTotalAmount()))
        {
            return false;
        }
        return getTransactionDate().equals(that.getTransactionDate());
    }

    @Override
    public int hashCode ()
    {
        int result = id.hashCode();
        result = 31 * result + getPersonId().hashCode();
        result = 31 * result + getVegetableId().hashCode();
        result = 31 * result + getVegetableQuantity().hashCode();
        result = 31 * result + getUnitPrice().hashCode();
        result = 31 * result + getTotalAmount().hashCode();
        result = 31 * result + getBagQuantity();
        result = 31 * result + getTransactionDate().hashCode();
        return result;
    }

    @Override
    public String toString ()
    {
        return "Transaction{" +
                "id=" + id +
                ", personId=" + personId +
                ", vegetableId=" + vegetableId +
                ", vegetableQuantity=" + vegetableQuantity +
                ", unitPrice=" + unitPrice +
                ", totalAmount=" + totalAmount +
                ", bagQuantity=" + bagQuantity +
                ", transactionDate=" + transactionDate +
                '}';
    }
}