public class E3 {
    public static void main(String[] args) {
        int[]arr= {1,54,7,2,87,3,4,2,3};
        int idx=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                idx=i;
                max=arr[i];
            }
        }
        System.out.println("the max number is: "+max+" at index: "+idx);
    }
}
