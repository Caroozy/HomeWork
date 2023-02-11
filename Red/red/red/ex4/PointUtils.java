package red.ex4;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class PointUtils {

    public static void movePoints(Point[] points, int dx, int dy) {

        for (int i = 0; i < points.length; i++) {
            points[i].move(dx, dy);
        }

    }

    public static void print(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
        System.out.println("----------------------------------------------------------");
    }

    public static Point merge(Point[] points) {

        Point result = new Point(0,0);
        for (int i = 0; i < points.length; i++) {
            result.move(points[i].getX(),points[i].getY());
        }
        return result;

    }
}
