package purple.ex3;

/**
 * Created by kobis on 17 Feb, 2022
 */
public class FactoryUtils {

    private static int count = 1;

    public static Item[] initItems(){
        Item[] items = new Item[10];
        for(int i=0;i<items.length;i++){
            int amount = (int)(Math.random()*26)+50;
            Category rand = Category.values()[(int)(Math.random()*3)];
            items[i]= new Item(count,"Item "+(count++),amount,rand);
        }
        return items;
    }

    public static int totalSize(Inventory inventory1,Inventory inventory2,Inventory inventory3){
        return inventory1.size()+inventory2.size()+inventory3.size();
    }

    public static int totalCount(Inventory inventory1,Inventory inventory2,Inventory inventory3){
        return inventory1.count()+inventory2.count()+inventory3.count();
    }
}
