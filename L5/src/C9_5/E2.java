package C9_5;

import java.util.Random;

public class E2 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);
        int sum = a+b;
        int avg= sum/2;
        int area= a*b;
        int perimeter= 2*a+2*b;
        System.out.println("a is "+a +" b is " +b);
        System.out.println("the sum is "+sum);
        System.out.println("the average is " +avg);
        System.out.println("the area is " +area);
        System.out.println("the perimeter is " +perimeter);
    }
}
