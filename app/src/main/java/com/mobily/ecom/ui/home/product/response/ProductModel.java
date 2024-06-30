package com.mobily.ecom.ui.home.product.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_ar")
    @Expose
    private String nameAr;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_ar")
    @Expose
    private String descriptionAr;
    @SerializedName("image")
    @Expose
    private List<String> image = null;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("price_group")
    @Expose
    private Object priceGroup;
    @SerializedName("variations")
    @Expose
    private List<Object> variations = null;
    @SerializedName("tax")
    @Expose
    private int tax;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = null;
    @SerializedName("category_ids")
    @Expose
    private List<CategoryIdModel> categoryIds = null;
    @SerializedName("choice_options")
    @Expose
    private List<Object> choiceOptions = null;
    @SerializedName("discount")
    @Expose
    private int discount;
    @SerializedName("discount_type")
    @Expose
    private String discountType;
    @SerializedName("tax_type")
    @Expose
    private String taxType;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("total_stock")
    @Expose
    private int totalStock;
    @SerializedName("capacity")
    @Expose
    private Object capacity;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("brand_id")
    @Expose
    private int brandId;
    @SerializedName("age_id")
    @Expose
    private Object ageId;
    @SerializedName("gomla_price")
    @Expose
    private double gomlaPrice;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("by_date")
    @Expose
    private String byDate;
    @SerializedName("wishlist_count")
    @Expose
    private int wishlistCount;
    @SerializedName("rating")
    @Expose
    private List<Object> rating = null;
    @SerializedName("ages")
    @Expose
    private List<AgesModel> ages = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Object getPriceGroup() {
        return priceGroup;
    }

    public void setPriceGroup(Object priceGroup) {
        this.priceGroup = priceGroup;
    }

    public List<Object> getVariations() {
        return variations;
    }

    public void setVariations(List<Object> variations) {
        this.variations = variations;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public List<CategoryIdModel> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<CategoryIdModel> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<Object> getChoiceOptions() {
        return choiceOptions;
    }

    public void setChoiceOptions(List<Object> choiceOptions) {
        this.choiceOptions = choiceOptions;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public Object getCapacity() {
        return capacity;
    }

    public void setCapacity(Object capacity) {
        this.capacity = capacity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public Object getAgeId() {
        return ageId;
    }

    public void setAgeId(Object ageId) {
        this.ageId = ageId;
    }

    public double getGomlaPrice() {
        return gomlaPrice;
    }

    public void setGomlaPrice(double gomlaPrice) {
        this.gomlaPrice = gomlaPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getByDate() {
        return byDate;
    }

    public void setByDate(String byDate) {
        this.byDate = byDate;
    }

    public int getWishlistCount() {
        return wishlistCount;
    }

    public void setWishlistCount(int wishlistCount) {
        this.wishlistCount = wishlistCount;
    }

    public List<Object> getRating() {
        return rating;
    }

    public void setRating(List<Object> rating) {
        this.rating = rating;
    }

    public List<AgesModel> getAges() {
        return ages;
    }

    public void setAges(List<AgesModel> ages) {
        this.ages = ages;
    }
}
