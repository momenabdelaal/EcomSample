package com.mobily.ecom.ui.home.product.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgesModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("age_id")
    @Expose
    private int ageId;
    @SerializedName("product_id")
    @Expose
    private int productId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("age")
    @Expose
    private AgeModel age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgeId() {
        return ageId;
    }

    public void setAgeId(int ageId) {
        this.ageId = ageId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AgeModel getAge() {
        return age;
    }

    public void setAge(AgeModel age) {
        this.age = age;
    }
}
