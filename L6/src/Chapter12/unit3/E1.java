package Chapter12.unit3;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int sum=1;
        Scanner scanner= new Scanner(System.in);
        int num=(int)(Math.random()*7)+1;
        System.out.println(num);
        for(int idx=1;idx<=num;idx++){
            sum*=idx;
        }
        System.out.println(sum);
    }
}
