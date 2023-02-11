package Chapter12unit7;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        int top=Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        while(num!=-999){
            if(num>top){
                top=num;
            }
            System.out.println("enter a number");
            num= scanner.nextInt();
        }
        System.out.println("the top number is: "+top);
        scanner.close();
    }
}
