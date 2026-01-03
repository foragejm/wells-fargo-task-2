package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Portfolio portfolio;
    private String name;
    private String category;
    private ZonedDateTime zonedDateTime;
    private BigDecimal purchasePrice;
    private float quantity;

    public Security() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
