package C9_5;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        int top= Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for(int idx=1;idx<=5;idx++){
            System.out.println("put a number ");
            int num=scanner.nextInt();
            if(num>top){
                top=num;
            }
            System.out.println(num);
        }
        System.out.println(top);
    }
}
