package C9_5;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you weight is: ");
        float w= scanner.nextFloat();
        System.out.println("your height is: ");
        float h= scanner.nextInt();
        System.out.println("Weight: "+w+ "| height "+h);
        System.out.println("the bmi score is: "+w/((h/100)*(h/100)));
    }
}
