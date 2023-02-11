package series3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number for a multiply method-insert 1 to stop on both parameters ");
        int a= scanner.nextInt();
        System.out.println("enter a second number for a multiply method-insert 1 to stop on both parameters");
        int b= scanner.nextInt();
        //insert 1 on both params to exit program
        while (a!=1&&b!=1){
            System.out.println(multiply(a,b));
            System.out.println("enter a number for a multiply method-insert 1 to stop on both parameters ");
            a= scanner.nextInt();
            System.out.println("enter a second number for a multiply method-insert 1 to stop on both parameters");
            b= scanner.nextInt();
        }
    }

    public static int multiply(int a,int b){
        if (b==1){ //when 'b' reaches 1 he stops the recursion
            return a;
        }
        return a+multiply(a,b-1); //recurring adds to 'a' himself and subs 'b'
    }
}
