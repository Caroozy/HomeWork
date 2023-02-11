package C16;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int a= scanner.nextInt();
        System.out.println("enter a number");
        int b= scanner.nextInt();
        int tmp;
        if(a>b){
            tmp=b;
            b=a;
            a=tmp;
        }
        System.out.println(random(a,b));
    }
    public static int random(int min,int max){
        return (int)(Math.random()*(max+1-min))+min;
    }
}
