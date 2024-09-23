package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    final Set<String> coins = Set.of("quarter",
            "dime",
            "nickel",
            "penny");

    return totalHelper((i) -> coins.contains(i.getName()), drawer);
  }

  private static int totalHelper(Predicate<Item> shouldInclude, List<Item> drawer) {
    return drawer.stream().reduce(0, (acc, cur) -> shouldInclude.test(cur) ? acc + cur.getQuantity() : acc,
            Integer::sum);
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {
    final Set<String> notes = Set.of("hundred",
            "twenty",
            "ten",
            "five",
            "one");

    return totalHelper((i) -> notes.contains(i.getName()), drawer);
  }
}
