package series3;

public class FactoryUtils {
    public static Item[] initItems() {
        Inventory i1 = new Inventory();
        for (int i = 0; i < i1.size(); i++) {
            i1.getItems()[i] = new Item(randomAmount(), randomCategory());
        }
        return i1.getItems();
    }

    public static String randomCategory() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return "Fruits";
            case 1:
                return "Cables";
            case 2:
                break;
        }
        return "Drinks";
    }

    public static int randomAmount() {
        return (int) (Math.random() * 26) + 50;
    }

    @Override
    public String toString() {
        return "FactoryUtils{}";
    }

    public static int totalSize(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        int amount = 0;
        int i = 1;
        while (i<=3){
            switch (i) {
                case 1:
                    amount += inventory1.size();
                    break;
                case 2:
                    amount += inventory2.size();
                    break;
                case 3:
                    amount += inventory3.size();
                    break;
            }
            i++;
        }
        return amount;
    }
    public static int totalCount(Inventory inventory1, Inventory inventory2, Inventory inventory3){
        int amount = 0;
        int i = 1;
        while (i<=3){
            switch (i) {
                case 1:
                    amount += inventory1.count();
                    break;
                case 2:
                    amount += inventory2.count();
                    break;
                case 3:
                    amount += inventory3.count();
                    break;
            }
            i++;
        }
        return amount;
    }
}
