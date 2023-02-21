package series3;

import java.util.Arrays;

public class Inventory {
    private Item[] items;

    public Inventory() {
        this.items = new Item[10];
        for (int i=0;i<this.items.length;i++){
            this.items[i]=new Item("Initialized","Initialized");
        }
    }

    public Inventory(Item[] items) {
        this.items = items.clone();
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
        return items.length;
    }

    public int count() {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == null) {
                return count;
            }
            count++;
        }
        return count;
    }
}
