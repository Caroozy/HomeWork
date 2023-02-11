package Series2.E1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is the height of the rectangle");
        double a= scanner.nextDouble();
        System.out.println("what is the width?");
        double b= scanner.nextDouble();
        System.out.println("what is the color");
        String color= scanner.next();
        rectangle one=new rectangle();
        rectangle two=new rectangle(a,b);
        rectangle three=new rectangle(a,b,color);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
