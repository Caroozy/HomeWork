package Task14unit3;

public class E7 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[]arr=new int[50];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*101);
            if(arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("bot num: "+min+" top num: "+max);
    }
}
