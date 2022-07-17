package com.jishnu.Items.model;

public class Items {
    //public String id;
    public String group;
    public String barcode;
    public String category;
    public String subCategory;
    public String itemName;
    public String imageUrl;
    public String type;
    public String mrp1;
    public String qty1;
    public int price1;
    public String unit1;

    
    // public String getId() {
    //     return id;
    // }


    // public void setId(String id) {
    //     this.id = id;
    // }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public String getBarcode() {
        return barcode;
    }


    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getSubCategory() {
        return subCategory;
    }


    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }


    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getMrp1() {
        return mrp1;
    }


    public void setMrp1(String mrp1) {
        this.mrp1 = mrp1;
    }


    public String getQty1() {
        return qty1;
    }


    public void setQty1(String qty1) {
        this.qty1 = qty1;
    }


    public int getPrice1() {
        return price1;
    }


    public void setPrice1(int price1) {
        this.price1 = price1;
    }


    public String getUnit1() {
        return unit1;
    }


    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }


    public Items() {
    }


    public Items(String group, String barcode, String category, String subCategory, String itemName,
            String imageUrl, String type, String mrp1, String qty1, int price1, String unit1) {
        //this.id = id;
        this.group = group;
        this.barcode = barcode;
        this.category = category;
        this.subCategory = subCategory;
        this.itemName = itemName;
        this.imageUrl = imageUrl;
        this.type = type;
        this.mrp1 = mrp1;
        this.qty1 = qty1;
        this.price1 = price1;
        this.unit1 = unit1;
    }


    @Override
    public String toString() {
        return "Items [barcode=" + barcode + ", category=" + category + ", group=" + group
                + ", imageUrl=" + imageUrl + ", itemName=" + itemName + ", mrp1=" + mrp1 + ", price1=" + price1
                + ", qty1=" + qty1 + ", subCategory=" + subCategory + ", type=" + type + ", unit1=" + unit1 + "]";
    }

    
}
