package C16;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter a number");
            int a= scanner.nextInt();
            System.out.println(a);
            System.out.println(prime(a));
        }
    }
    public static boolean prime(int a){
        boolean prime=true;
        for (int i=2;i<=a/2;i++){
            if(a%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
}
