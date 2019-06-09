package inventory.models;

import org.springframework.data.annotation.Id;

public class Inventory {

  @Id
  public String id;
  public String name;
  public String description;
  public int price;
  public String img;
  public int stock;

  public Inventory() {}

  public Inventory(String name, String description, int price, String img, int stock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.img = img;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return String.format(
        "Item[id=%s, name=%s, description=%s, price=%s, img=%s, stock=%s]",
        id, name, description, price, img, stock);
  }
}

