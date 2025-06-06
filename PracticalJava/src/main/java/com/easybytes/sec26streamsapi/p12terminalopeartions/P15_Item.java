package com.easybytes.sec26streamsapi.p12terminalopeartions;

public class P15_Item {

    private String name;
    private double price;
    private boolean inStock;
    private boolean onSale;

    public P15_Item(String name, double price, boolean inStock, boolean onSale) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    @Override
    public String toString() {
        return "P15_Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", onSale=" + onSale +
                '}';
    }
}
