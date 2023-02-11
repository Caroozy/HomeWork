package C9_1;

import java.util.Scanner;

public class C91E7 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int top = num;
        for (int idx = 1; idx < 3; idx++) {
            System.out.println("enter a number");
            int num2 = scanner.nextInt();
            if (num2 > top) {
                top = num2;
            }

        }
        System.out.println(top);
    }
}
