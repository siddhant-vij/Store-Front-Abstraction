package com.StoreFront;

import java.util.Formatter;

public class Mouse extends Product {

  public Mouse(String type, String name, double price, String description) {
    super(type, name, price, description);
  }

  @Override
  public void showDetails() {
    Formatter fmt = new Formatter();
    fmt.format("%-8s | %-8s | %8.2f | %s", getClass().getSimpleName(), name, price, description);
    System.out.println(fmt);
  }

}
