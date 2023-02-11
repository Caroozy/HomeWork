package red.ex4;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(10, 7);
        Point[] points = {p1, p2, p3};
        PointUtils.print(points);
        PointUtils.movePoints(points,1,5);
        PointUtils.print(points);
        System.out.println(PointUtils.merge(points));


    }
}
