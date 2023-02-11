package Chapter12unit7;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int fact=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        while(num!=0) {
            if (num == 0) {
                System.out.println("we haven't even started");
                return;
            }
            for (int idx = 1; idx <= num; idx++) {
                fact *= idx;
            }
            System.out.println(fact);
            fact=1;
            System.out.println("enter number");
            num= scanner.nextInt();
        }
    }
}
