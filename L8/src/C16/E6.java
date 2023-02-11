package C16;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        System.out.println(max(1,3,9));
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int a= scanner.nextInt();
        System.out.println("enter number");
        int b= scanner.nextInt();
        System.out.println("enter number");
        int c= scanner.nextInt();
        System.out.println(max(a,b,c));

    }
    static int max(int a,int b,int c){
        int top=Integer.MIN_VALUE;
        for(int i=1;i<=3;i++){
            switch (i){
                case 1:
                    if(a>top){
                        top=a;
                    }
                case 2:
                    if(b>top){
                        top=b;
                    }
                case 3:
                    if(c>top){
                        top=c;
                    }
            }
        }
        return top;
    }
}
