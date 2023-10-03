package com.StoreFront;

public abstract class Product {

  protected String type;
  protected String name;
  protected double price;
  protected String description;

  public Product(String type, String name, double price, String description) {
    this.type = type;
    this.name = name;
    this.price = price;
    this.description = description;
  }

  public double getSalesPrice(int quantity) {
    return price * quantity;
  }

  public void printPricedLineItem(int quantity) {
    System.out.printf("%-20s | %-4d | %8.2f | %8.2f | %s%n", type + " - " + name, quantity, price, quantity * price,
        description);
  }

  public abstract void showDetails();

}
