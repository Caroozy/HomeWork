package series4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number for a power method-insert 1 to stop on both parameters");
        int a= scanner.nextInt();
        System.out.println("enter a second number for a power method-insert 1 to stop on both parameters");
        int b= scanner.nextInt();
        //insert 1 on both params to exit program
        while (a!=1&&b!=1){
            System.out.println("_____________________");
            System.out.println(pow(a,b));
            System.out.println("enter a number for a power method-insert 1 to stop on both parameters");
            a= scanner.nextInt();
            System.out.println("enter a second number for a power method-insert 1 to stop on both parameters");
            b= scanner.nextInt();
        }
    }
    public static int pow(int a,int b){
        if (b==1){ //stops the recursion
            return a;
        }
        return a*pow(a,b-1);//recurring multiply by another 'a'
    }
}
