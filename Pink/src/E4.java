import java.util.ArrayList;
import java.util.Arrays;

public class E4 {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,17,21,5};
        int[]arr2 = {6,76,42};
        int[]tmp=new int[arr2.length+ arr1.length];
        System.arraycopy(arr2,0,tmp,0,arr2.length);
        System.arraycopy(arr1,0,tmp,(arr2.length),arr1.length);
        arr2=tmp.clone();
        for (int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
