package C16;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        int[]arr=new int[100];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*401)-200;
        }
        System.out.println("array");
        print(arr);
        System.out.println("summary: "+summary(arr));
        System.out.println("average: "+average(arr));
        System.out.println("maximum: "+max(arr)+"| position: "+maxidx(arr));
        System.out.println("minimum: "+min(arr)+"| position: "+minidx(arr));
        System.out.println("even number summary: "+sumeven(arr));
        System.out.println("odd numbers summary: "+sumodd(arr));
        System.out.println("write a number that might exist");
        int num= scanner.nextInt();
        System.out.println(exists(arr,num)==true?"the number exists":"the number does not exist");
        System.out.println("write a number that might exist");
        num= scanner.nextInt();
        System.out.println(existsidx(arr,num));
        System.out.println("the program has finished successfully");

    }
    public static void print(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"-");
        }
    }
    public static int summary(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int average(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum/ arr.length;
    }
    public static int max(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int maxidx(int[]arr){
        int i=0;
        while (arr[i]!=max(arr)){
            i++;
        }
        return i;
    }
    public static int minidx(int[]arr){
        int i=0;
        while (arr[i]!=min(arr)){
            i++;
        }
        return i;
    }
    public static int sumeven(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static int sumodd(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]%2==1){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static boolean exists(int[]arr,int num){
        boolean exists=false;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                exists=true;
                break;
            }
        }
        return exists;
    }
    public static int existsidx(int[]arr,int num){
        int idx=-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                idx=i;
                break;
            }
        }
        return idx;
    }

}
