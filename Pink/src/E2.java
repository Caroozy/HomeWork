public class E2 {
    public static void main(String[] args) {
        int[]arr= {1,54,7,2,87,3,4,2,3};
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
