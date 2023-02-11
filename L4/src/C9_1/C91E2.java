package C9_1;

import java.util.Scanner;

public class C91E2 {
    public static void main(String[] args) {
        int idx = 1;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
            for (idx = 1; idx <= 3; idx++) {
            System.out.println("enter num");
            int num = scanner.nextInt();
            total += num;
        }


        System.out.println(total);
    }
}