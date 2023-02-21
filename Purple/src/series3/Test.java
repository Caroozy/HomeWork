package series3;

public class Test {
    public static void main(String[] args) {
        Inventory inventory1=new Inventory();
        Inventory inventory2=new Inventory(FactoryUtils.initItems());
        Inventory inventory3=new Inventory();
        inventory3.setItems(inventory2.getItems());
        System.out.println(inventory1);
        System.out.println(inventory2);
        System.out.println(inventory3);
        System.out.println("Inventory amount: "+FactoryUtils.totalSize(inventory1,inventory2,inventory3));
        System.out.println("Inventory initialized amount: "+FactoryUtils.totalCount(inventory1,inventory2,inventory3));
    }
}
