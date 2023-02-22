package purple.ex3;

import java.util.Arrays;

/**
 * Created by kobis on 17 Feb, 2022
 */
public class Inventory {

    private Item[] items;


    public Inventory() {
        this.items = new Item[10];
    }

    public Inventory(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public int size() {
        return this.items.length;
    }

    public int count() {
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }
}
