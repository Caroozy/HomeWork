package C16;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5));
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        float a= scanner.nextFloat();
        System.out.println("enter a number");
        float b= scanner.nextFloat();
        System.out.println("enter a number");
        float c= scanner.nextFloat();
        System.out.println("enter a number");
        float d= scanner.nextFloat();
        System.out.println("enter a number");
        float e= scanner.nextFloat();
        System.out.println(average(a,b,c,d,e));

    }

    public static float average(float a,float b, float c,float d, float e){
        return (a+b+c+d+e)/5;
    }
}
