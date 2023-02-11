package Task14unit5;

public class E3 {
    public static void main(String[] args) {
        boolean single=true;
        int ar3counter=0;
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[]arr3=new int[10];
        for(int i=0;i< arr1.length;i++){
            for(int id=0;id< arr2.length;id++){
                if (arr2[i]==arr1[id]){
                    single=false;
                }
            }
            if(single){
                arr3[ar3counter]=arr2[i];
                ar3counter++;
            }
            single=true;
        }
        for (int i=0;i< arr3.length;i++){
            System.out.print(arr3[i]+"-");
        }
    }
}
