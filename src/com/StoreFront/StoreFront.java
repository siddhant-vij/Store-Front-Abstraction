package com.StoreFront;

import java.util.List;

public class StoreFront {
  List<Product> products;

  public StoreFront(List<Product> products) {
    this.products = products;
  }

  public void displayProducts() {
    System.out.println("\nList of Products available at the Store: ");
    int id = 1;
    for (Product product : products) {
      System.out.printf("%4d | ", id++);
      product.showDetails();
    }
  }

  private void placeOrder(List<OrderItem> order1Items) {
    System.out.println("Order Placed");
  }

  private void generateInvoice(List<OrderItem> orderItems) {
    int id = 1;
    double totalPrice = 0.0d;
    for (OrderItem orderItem : orderItems) {
      totalPrice += orderItem.product.getSalesPrice(orderItem.quantity);
      System.out.printf("%4d | ", id++);
      orderItem.product.printPricedLineItem(orderItem.quantity);
    }
    System.out.println("\nTotal Price: " + totalPrice + "\n");
  }

  public static void main(String[] args) {
    Product keyboard = new Keyboard("Keyboard", "Logitech", 100, "Best keyboard at Store Front, India");
    Product mouse = new Mouse("Mouse", "Logitech", 50, "Best mouse at Store Front, India");
    Product laptop = new Laptop("Laptop", "Dell", 1000, "Best laptop at Store Front, India");
    Product monitor = new Monitor("Monitor", "Samsung", 200, "Best monitor at Store Front, India");

    List<Product> products = List.of(keyboard, mouse, laptop, monitor);

    StoreFront storeFront = new StoreFront(products);
    storeFront.displayProducts();

    System.out.println();

    System.out.println("Order 1");
    List<OrderItem> order1Items = List.of(
        new OrderItem(2, keyboard),
        new OrderItem(6, mouse),
        new OrderItem(3, laptop));
    storeFront.placeOrder(order1Items);
    storeFront.generateInvoice(order1Items);

    System.out.println();

    System.out.println("Order 2");
    List<OrderItem> order2Items = List.of(
        new OrderItem(1, keyboard),
        new OrderItem(3, mouse),
        new OrderItem(2, laptop));
    storeFront.placeOrder(order2Items);
    storeFront.generateInvoice(order2Items);
  }
}
