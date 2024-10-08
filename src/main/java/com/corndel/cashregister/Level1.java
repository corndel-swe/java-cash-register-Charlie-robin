package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;
import java.util.stream.Collectors;

public class Level1 {
  /**
   * Goes into the given drawer and removes 1 item with the given name.
   * E.g. ("penny", drawer) removes 1 penny from the given drawer.
   */
  public static List<Item> removeItem(String name, List<Item> drawer) {
    // TODO
    return drawer.stream().peek(item -> {
      if (item.getName().equals(name)) {
        item.setQuantity(Math.max(0, item.getQuantity() - 1));
      }
    }).collect(Collectors.toList());
  }

  /**
   * The same as removeItem but adds an item of currency instead
   */
  public static List<Item> addItem(String name, List<Item> drawer) {
    return drawer.stream().peek(item -> {
      if (item.getName().equals(name)) {
        item.setQuantity(item.getQuantity() + 1);
      }
    }).collect(Collectors.toList());
  }

  /**
   * For debugging! Feel free to change it to debug addItem, too.
   * You can add methods like this to the other challenges for debugging.
   */
  public static void main(String[] args) {
    removeItem("penny", Drawer.drawer);

    for (var item : Drawer.drawer) {
      var summary = String.format("%s: %d", item.getName(), item.getQuantity());
      System.out.println(summary);
    }
  }
}
