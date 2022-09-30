package com.example.demo;

public class Stock {
    private String name;
    private String cname;
    private String date;
    private String price;

    private String qunt;

    public Stock(String name, String cname, String date, String price, String qunt) {
        this.name = name;
        this.cname = cname;
        this.date = date;
        this.price = price;

        this.qunt = qunt;
    }

    public String getName() {
        return name;
    }

    public String getCname() {
        return cname;
    }

    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }


    public String getQunt() {
        return qunt;
    }
}
