package red.ex2;

/**
 * Created by kobis on 03 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {
        Date d1 = new Date(-5,13,1985);
        System.out.println(d1);

        Date d2 = new Date(18,7,2022);
        System.out.println(d2);

        Employee e1 = new Employee();
        System.out.println(e1);

        Employee e2 = new Employee("Moshe","Cohen",d1,d2);
        System.out.println(e2);

        Employee e3 = new Employee("Moshe","Cohen",new Date(-5,13,1985),new Date(18,7,2022));
        System.out.println(e3);
    }
}
