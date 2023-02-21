package series3;

public class FactoryUtils {
    public static Item[] initItems() {
        Inventory i1 = new Inventory();
        for (int i = 0; i < i1.getItems().length; i++) {
            i1.getItems()[i] = new Item(Item.getCount(), "whatever", (int) (Math.random() * 26) + 50, randomCategory());
        }
        return i1.getItems();
    }

    public static String randomCategory() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 1:
                return "Fruits";
            case 2:
                return "Cables";
        }
        return "Drinks";
    }

    @Override
    public String toString() {
        return "FactoryUtils{}";
    }

    public static int totalSize(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        return inventory1.getItems().length+inventory2.getItems().length+inventory3.getItems().length;
    }

    public static int totalCount(Inventory inventory1, Inventory inventory2, Inventory inventory3){
        int count=0;
        for (int i=0;i<inventory1.getItems().length;i++){
            if (inventory1.getItems()[i].getCategory()!="Initialized"){count++;}
        }
        for (int i=0;i<inventory2.getItems().length;i++){
            if (inventory2.getItems()[i].getCategory()!="Initialized"){count++;}
        }
        for (int i=0;i<inventory3.getItems().length;i++){
            if (inventory3.getItems()[i].getCategory()!="Initialized"){count++;}
        }
        return count;
    }
}
