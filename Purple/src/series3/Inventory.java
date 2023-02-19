package series3;

import java.util.Arrays;

public class Inventory {
    private Item[]items;

    public Inventory(){
        items=new Item[10];
    }
    public Inventory(Item[]items){
        for (int i=0;i<items.length;i++){
            this.items[i]=items[i];
        }
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
    public int size(){
        return items.length;
    }
    public int count(){
        int count=0;
        for (int i=0;i< items.length;i++){
            if (items[i].getCategory()!=null){
                count++;
            }
        }
        return count;
    }
}
