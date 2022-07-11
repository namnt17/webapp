package com.example.week4_webapp.model;

public class OrdersDetail extends Mobile {
    private int orderId;
    private int uid;
    private int quantity;
    private int bid;

    public OrdersDetail() {

    }

    public OrdersDetail(int orderId, int uid, int quantity, int bid) {
        super();
        this.orderId = orderId;
        this.uid = uid;
        this.quantity = quantity;
        this.bid = bid;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "OrdersDetail{" +
                "orderId=" + orderId +
                ", uid=" + uid +
                ", quantity=" + quantity +
                ", bid=" + bid +
                '}';
    }
}
