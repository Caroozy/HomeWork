package Series2.E3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("whats the lights lifespan?");
        int totalHours= scanner.nextInt();
        System.out.println("whats the color?");
        String color= scanner.next();
        System.out.println("whats the cost?");
        double cost= scanner.nextDouble();
        light one=new light(totalHours,cost);
        light two=new light(totalHours,color);
        light three=new light(totalHours,color,cost);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
