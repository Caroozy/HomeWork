package Task14unit5;

public class E10 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 ,  5 ,  1 ,  6 ,  1 ,  5 , 4 ,  8};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int count1=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]==1){
                count1++;
            }
        }
        int[]arr1=new int[3];
        arr1[0]=max;
        arr1[1]=min;
        arr1[2]=count1;
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+"-");
        }
    }
}
