package purple.ex3;

/**
 * Created by kobis on 17 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {
        Inventory i1 = new Inventory();
        Inventory i2 = new Inventory(FactoryUtils.initItems());
        Inventory i3 = new Inventory(FactoryUtils.initItems());

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("--------------------------------");
        System.out.println(FactoryUtils.totalSize(i1,i2,i3));
        System.out.println(FactoryUtils.totalCount(i1,i2,i3));
    }
}
