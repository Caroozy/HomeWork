package C10_3;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your age");
        float age = scanner.nextFloat();
        String msg = age>21 ? "able to enter":"unable to enter";
        System.out.println(msg);
    }
}
