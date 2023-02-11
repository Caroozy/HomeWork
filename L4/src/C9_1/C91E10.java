package C9_1;

import java.util.Scanner;

public class C91E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your age:");
        float age= scanner.nextFloat();
        if(age>=18){
            System.out.println("you good");
        }else{
            System.out.println("go home");
        }
    }
}
