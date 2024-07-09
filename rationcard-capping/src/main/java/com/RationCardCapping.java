package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RationCardCapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rcCapping;
    private int aayRcTotal;
    private String stateCode; // Changed to String to match MasterState

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRcCapping() {
        return rcCapping;
    }

    public void setRcCapping(int rcCapping) {
        this.rcCapping = rcCapping;
    }

    public int getAayRcTotal() {
        return aayRcTotal;
    }

    public void setAayRcTotal(int aayRcTotal) {
        this.aayRcTotal = aayRcTotal;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
