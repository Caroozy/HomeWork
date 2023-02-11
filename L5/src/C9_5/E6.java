package C9_5;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the players name is ");
        String name = scanner.next();
        System.out.println("the team he plays at is ");
        String team= scanner.next();
        System.out.println("the players age is ");
        float age = scanner.nextFloat();
        int goals= (int)(Math.random()*850)+151;
        if(goals>600){
            System.out.println("WOW");
        }
        System.out.println("Name: "+name+"| Club: "+team+"| Age: "+age);
        System.out.println(goals+" Goals scored");
    }
}
