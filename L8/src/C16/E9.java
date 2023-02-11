package C16;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int a= scanner.nextInt();
        side(a);
    }
    public static void side(int a){
        char[][]arr=new char[a][a];
        for (int i=0;i< arr.length;i++){
            for(int id=0;id< arr.length;id++){
                if(i==0){
                    arr[i][id]='*';
                }else if(id==0){
                    arr[i][id]='*';
                }else if(i==arr.length-1){
                    arr[i][id]='*';
                }else if(id== arr.length-1){
                    arr[i][id]='*';
                }else{
                    arr[i][id]=' ';
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                System.out.print(arr[i][id]+" ");
            }
            System.out.println();
        }
    }
}
