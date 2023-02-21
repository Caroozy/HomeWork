package series3;

public class Test {
    public static void main(String[] args) {
        Inventory inventory1=new Inventory();
        Inventory inventory2=new Inventory(FactoryUtils.initItems());
        Inventory inventory3=new Inventory();
        inventory3.setItems(inventory2.getItems());
        System.out.println(FactoryUtils.totalSize(inventory1,inventory2,inventory3));
        System.out.println(FactoryUtils.totalCount(inventory1,inventory2,inventory3));
    }
}
