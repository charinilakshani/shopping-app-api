package com.charini.ccafe.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class priceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String model;
    private  String damageType;
    private  String damageArea;
    private  String repireCost;
    private  int  replaceCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDamageArea() {
        return damageArea;
    }

    public void setDamageArea(String damageArea) {
        this.damageArea = damageArea;
    }

    public String getRepireCost() {
        return repireCost;
    }

    public void setRepireCost(String repireCost) {
        this.repireCost = repireCost;
    }

    public int getReplaceCost() {
        return replaceCost;
    }

    public void setReplaceCost(int replaceCost) {
        this.replaceCost = replaceCost;
    }
}

