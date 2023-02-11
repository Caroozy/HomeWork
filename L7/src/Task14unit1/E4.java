package Task14unit1;

public class E4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};
        int count1=0;
        int count3=0;
        int count2_5=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1++;
            } else if (arr[i]==3) {
                count3++;
            } else if (arr[i]==2|| arr[i]==5) {
                count2_5++;
            }
        }
        System.out.println("1 appears "+count1+" times");
        System.out.println("3 appears "+count3+" times");
        System.out.println("2 and 5 appear "+count2_5+" times");
    }
}
