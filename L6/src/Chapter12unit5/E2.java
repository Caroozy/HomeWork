package Chapter12unit5;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();
        int a1=1;
        int a2=1;
        int tmp;
        if(num<2){
            if(num==1){
                System.out.print("1-fn1");
            }else{
                System.out.println("unsupported");
            }
        }else{
            System.out.print("1-fn1- ");
        }
        for(int idx=2;idx<=num;idx++){
            tmp=a1+a2;
            System.out.print(a2+"-fn"+idx+"- ");
            a1=a2;
            a2=tmp;
        }
        scanner.close();
    }
}
