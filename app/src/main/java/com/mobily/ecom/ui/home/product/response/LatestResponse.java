package com.mobily.ecom.ui.home.product.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LatestResponse {
    @SerializedName("total_size")
    @Expose
    private int totalSize;
    @SerializedName("limit")
    @Expose
    private Object limit;
    @SerializedName("offset")
    @Expose
    private Object offset;
    @SerializedName("products")
    @Expose
    private List<ProductModel> products = null;

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public Object getLimit() {
        return limit;
    }

    public void setLimit(Object limit) {
        this.limit = limit;
    }

    public Object getOffset() {
        return offset;
    }

    public void setOffset(Object offset) {
        this.offset = offset;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }
}
