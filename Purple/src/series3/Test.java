package series3;

public class Test {
    public static void main(String[] args) {
        Inventory i1=new Inventory();
        Inventory i2=new Inventory();
        Inventory i3=new Inventory();
        System.out.println(FactoryUtils.totalSize(i1,i2,i3));
        System.out.println(FactoryUtils.totalCount(i1,i2,i3));
    }
}
