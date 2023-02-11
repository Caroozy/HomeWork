package C9_1;

import java.util.Scanner;

public class C91E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        while(num>=0){
            if (num%2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
            System.out.println("enter number");
            num = scanner.nextInt();
        }
    }

}
