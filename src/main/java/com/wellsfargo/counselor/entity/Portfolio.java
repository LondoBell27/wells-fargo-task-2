package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){

    }

    public Portfolio(String clientId, String creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long portfolioId() {
        return (Long) portfolioId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }
}
