package com.charini.ccafe.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int promotionId;
    private int promotionPercentage;
    private  int imageUrL;


    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getPromotionPercentage() {
        return promotionPercentage;
    }

    public void setPromotionPercentage(int promotionPercentage) {
        this.promotionPercentage = promotionPercentage;
    }

    public int getImageUrL() {
        return imageUrL;
    }

    public void setImageUrL(int imageUrL) {
        this.imageUrL = imageUrL;
    }
}
