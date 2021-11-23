package com.example.week4_webapp.model;

public class OrderCustomer {
    private int id;
    private String name_kh;
    private String address;
    private String group;
    private int quantity;
    private double totalPrice;

    public OrderCustomer() {
    }

    public OrderCustomer(int id, String name_kh, String address, String group, int quantity, double totalPrice) {
        this.id = id;
        this.name_kh = name_kh;
        this.address = address;
        this.group = group;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public OrderCustomer(String name_kh, String address, String group, int quantity, double totalPrice) {
        this.name_kh = name_kh;
        this.address = address;
        this.group = group;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_kh() {
        return name_kh;
    }

    public void setName_kh(String name_kh) {
        this.name_kh = name_kh;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
