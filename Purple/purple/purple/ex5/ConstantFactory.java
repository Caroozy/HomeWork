package purple.ex5;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class ConstantFactory {

    public static int rand(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String color() {
        int val = (int) (Math.random() * 100);
        return (val < 50) ? "Yellow" : ((val < 70) ? "Gray" : (val < 85) ? "Dark Gray" : "Dark Blue");
    }
}
