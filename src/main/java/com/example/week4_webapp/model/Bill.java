package com.example.week4_webapp.model;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private int b_id;
    private List<Cart> listCart = new ArrayList<>();
    private Customer customer;
    private double total;

    public Bill() {
    }

    public Bill(List<Cart> listCart, Customer customer, double total) {
        this.listCart = listCart;
        this.customer = customer;
        this.total = total;
    }

    public Bill(List<Cart> listCart, Customer customer) {
        this.listCart = listCart;
        this.customer = customer;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public List<Cart> getListCart() {
        return listCart;
    }

    public void setListCart(List<Cart> listCart) {
        this.listCart = listCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
