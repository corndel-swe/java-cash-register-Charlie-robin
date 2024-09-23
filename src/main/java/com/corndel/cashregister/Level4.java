package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;

import java.util.List;

public class Level4 {
    /**
     * Returns true if it is possible to make the target amount out of the cash in
     * the drawer. Returns false if it is not possible.
     */
    public static boolean canMakeAmount(int target, List<Item> drawer) {
        int index = 0;
        int quantity = 0;
        while (index < drawer.size()) {
            Item item = drawer.get(index);
            if (target - item.getValue() >= 0) {
                target -= item.getValue();
            }

            if (quantity == 0) {
                quantity = item.getQuantity();
            }

            if (quantity > 1) {
                quantity -= 1;
            } else {
                index++;
                quantity = 0;
            }
        }

        return target == 0;
    }
}
