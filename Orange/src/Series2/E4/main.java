package Series2.E4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        box one=new box();
        box two=new box(a,b,c);
        System.out.println(one);
        System.out.println(two);
        scanner.close();
    }
}
