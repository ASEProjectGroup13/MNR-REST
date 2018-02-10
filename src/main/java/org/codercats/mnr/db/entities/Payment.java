package org.codercats.mnr.db.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Venu Babu Kolla.
 */
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)")
    private BigInteger id;

    private int personId;

    private BigDecimal paymentAmount;

    private BigDecimal remainingBalance;

    private Date transactionDate;

    public BigInteger getId() {
        return id;
    }

    public Payment setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public int getPersonId() {
        return personId;
    }

    public Payment setPersonId(final int personId) {
        this.personId = personId;
        return this;
    }

    public BigDecimal getPaymentAmount() { return paymentAmount; }

    public Payment setPaymentAmount(final BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public BigDecimal getRemainingBalance() { return remainingBalance; }

    public Payment setRemainingBalance(final BigDecimal remainingBalance) {
        this.remainingBalance = remainingBalance;
        return this;
    }

    public Date getTransactionDate() { return transactionDate; }

    public Payment setTransactionDate(final Date transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }
}
