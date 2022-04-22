package com.techelevator;

public abstract class MenuItem {
    private String productName;
    private String productCode;
    private String productDescription;
    private String upsaleMessage;
    private double productPrice;
    private int quantity;
    //abstract class signifies that other classes that are a menuItem should inherit from it. example...beverages, appetizers etc.

    //MenuItem constructor
    public MenuItem(String productName, String productCode, String productDescription, String upsaleMessage,
                    int quantity, double productPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.upsaleMessage = upsaleMessage;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    //Getters and setters for menuitem

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getUpsaleMessage() {
        return upsaleMessage;
    }

    public void setUpsaleMessage(String upsaleMessage) {
        this.upsaleMessage = upsaleMessage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
