package Task14unit5;

public class E5 {
    public static void main(String[] args) {
        boolean singlea1=true;
        boolean dbla1=true;
        int ar3counter=0;
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[]arr3= new int[10];
        for(int i=0;i< arr1.length;i++){
            for(int id=0;id<arr2.length;id++){
                if(arr1[i]==arr2[id]){
                    singlea1=false;
                }
            }
            if(singlea1){
                for(int id=0;id< arr3.length;id++){
                    if(arr1[i]==arr3[id]){
                        dbla1=false;
                    }
                }
                if (dbla1){
                    arr3[ar3counter]=arr1[i];
                    ar3counter++;
                }
                dbla1=true;
            }
            singlea1=true;
        }
        for(int i=0;i< arr1.length;i++){
            for(int id=0;id<arr2.length;id++){
                if(arr2[i]==arr1[id]){
                    singlea1=false;
                }
            }
            if(singlea1){
                for(int id=0;id< arr3.length;id++){
                    if(arr2[i]==arr3[id]){
                        dbla1=false;
                    }
                }
                if (dbla1){
                    arr3[ar3counter]=arr2[i];
                    ar3counter++;
                }
                dbla1=true;
            }
            singlea1=true;
        }
        for (int i=0;i< arr3.length;i++){
            System.out.print(arr3[i]+"-");
        }
    }
}
