package org.codercats.mnr.db.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Venu Babu Kolla.
 */
@Entity
@Table(name = "AccountBalance")
public class AccountBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10)")
    private BigInteger id;

    private int personId;

    private BigDecimal balance;

    public BigInteger getId() {
        return id;
    }

    public AccountBalance setId(BigInteger id) {
        this.id = id;
        return this;
    }

    public int getPersonId() { return personId; }

    public AccountBalance setPersonId(final BigDecimal balance) {
        this.balance = balance;
        return this;
    }
}
