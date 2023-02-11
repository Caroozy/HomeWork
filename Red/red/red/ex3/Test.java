package red.ex3;

/**
 * Created by kobis on 03 Feb, 2022
 */
public class Test {
    public static void main(String[] args) {

        Point p1 = new Point(2,7);
        Point p2 = new Point(4,8);

        Line l1 = new Line(p1,p2);
        System.out.println(l1);

        Line l2 = new Line(l1);

        Point p3 = new Point(5,5);
        Point p4 = new Point(6,6);
        Line l3 = new Line(p3,p4);
        Line l4 = new Line(l3);
    }



}
