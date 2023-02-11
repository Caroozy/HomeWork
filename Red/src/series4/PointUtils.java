package series4;

import java.awt.Point;

public class PointUtils {
    private int dx;
    private int dy;

    public static void movePoints(Point []points,int dy,int dx){
        for (int i=0;i< points.length;i++){
            points[i].move(dx,dy);
        }
    }
    public static Point merge(Point[]points){
        Point result=new Point(0,0);
        for (int i=0;i< points.length;i++){
            result.move((int) points[i].getX(), (int) points[i].getY());
        }
        return result;
    }
}
