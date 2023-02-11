package Chapter12unit7;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        System.out.println("enter a number");
        int num= scanner.nextInt();
        while(num>0){
            sum+=num;
            System.out.println("enter a number");
            num= scanner.nextInt();
        }
        System.out.println(sum);
    }
}
