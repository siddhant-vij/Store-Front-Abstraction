package com.StoreFront;

public class OrderItem {
  int quantity;
  Product product;

  public OrderItem(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }
}
