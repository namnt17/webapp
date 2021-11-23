package com.example.week4_webapp.model;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String group;

    public Customer() {
    }

    public Customer(int id, String name, String address, String group) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.group = group;
    }

    public Customer(String name, String address, String group) {
        this.name = name;
        this.address = address;
        this.group = group;
    }

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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
