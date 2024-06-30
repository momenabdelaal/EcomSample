package com.mobily.ecom.ui.home.product.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryIdModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("position")
    @Expose
    private int position;

}
