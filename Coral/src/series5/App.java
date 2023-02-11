package series5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a countdown number-insert 0 or a lower number");
        int num= scanner.nextInt();
        while (num>0){
            countDown(num);
            System.out.println("enter a countdown number-insert 0 or a lower number");
            num= scanner.nextInt();
        }
    }
    public static void countDown(int num){
        if (num==0){
            System.out.println("Stop!");
            return;
        }
        System.out.println(num);
        countDown(num-1);
    }

}
