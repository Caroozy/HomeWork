import java.util.Scanner;

public class Simulation2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][16];
        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            for (int ii = i; ii > 0; ii--) {
                num *= 2;
            }
            arr[i][0] = num;
            System.out.print(arr[i][0] + " ");
            for (int id = 1; id < arr[i].length; id++) {
                if(id%arr[i][0]==0){
                    arr[i][id]=arr[i][id-1]+arr[i][0]+1;
                    System.out.print(arr[i][id] + " ");
                }else{
                    arr[i][id]=arr[i][id-1]+1;
                    System.out.print(arr[i][id] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("please choose a number between 1-31");
        Scanner scanner =new Scanner(System.in);
        int num= scanner.nextInt();
        while (num>31||num<1){
            System.out.println("try again a number between 1-31");
            num= scanner.nextInt();
        }
        row(arr,num);
    }
    public static void row(int[][]arr,int num){
        int numchosen=0;
        for(int i= arr.length-1;i>=0;i--){
            while(num>=arr[i][0]){
                System.out.print(i+1+" ");
                num-=arr[i][0];
                numchosen+=arr[i][0];
            }
        }
        System.out.println();
        System.out.println("the number chosen is: "+numchosen);
    }
}