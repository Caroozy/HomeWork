package series1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("every number you enter gets its factorial- insert negative number to stop the program");
        int num= scanner.nextInt();
        while (num>=0){
            System.out.println("______________");
            System.out.println(factorial(num));
            System.out.println("re-enter a number");
            num= scanner.nextInt();
        }
    }
    public static int factorial(int num){
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
