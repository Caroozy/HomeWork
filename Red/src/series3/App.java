package series3;

public class App {
    public static void main(String[] args) {
        Point p1=new Point(5,7);
        System.out.println(p1);
        Point p2=new Point(4,6);
        System.out.println(p2);
        Line l1=new Line(p1,p2);
        System.out.println(l1);
        Line l2=new Line(l1);
        System.out.println(l2);

    }
}
