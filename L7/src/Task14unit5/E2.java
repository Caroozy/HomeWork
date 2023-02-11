package Task14unit5;

public class E2 {
    public static void main(String[] args) {
        int[] arr3 = new int[10];
        int ar3count=0;
        boolean single=false;
        boolean dbl=false;
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        for(int i=0;i< arr1.length;i++){
            for(int id=0;id< arr2.length;id++){
                if(arr1[i]==arr2[id]){
                    single=true;
                }
            }
            if(!single){
                for(int id=0;id< arr3.length;id++){
                    for(int idx=0;idx<arr3.length;idx++){
                        if(arr1[i]==arr3[idx]){
                            dbl=true;
                        }
                    }
                }
                if (!dbl){
                    arr3[ar3count]=arr1[i];
                    ar3count++;
                }
            }
            single= false;
            dbl=false;
        }
        for (int i=0;i< arr3.length;i++){
            System.out.print(arr3[i]+"-");
        }
    }
}
