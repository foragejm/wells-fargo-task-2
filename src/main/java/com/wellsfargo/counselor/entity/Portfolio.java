package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Client client;
    private String name;
    @OneToMany
    private List<Security> securities;

    public Portfolio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
