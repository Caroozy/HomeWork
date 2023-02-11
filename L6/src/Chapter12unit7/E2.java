package Chapter12unit7;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        int sum=0;
        int idx;
        if(num<0){
            System.out.println("unsupported");
            return;
        }
        for(idx=0;num>0;idx++){
            sum+=num;
            System.out.println("enter a number");
            num= scanner.nextInt();
        }
        System.out.println(sum);
        System.out.println("the average is: "+(sum/idx));
    }
}
