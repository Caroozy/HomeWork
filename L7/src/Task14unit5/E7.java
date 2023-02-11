package Task14unit5;

public class E7 {
    public static void main(String[] args) {
        int[] arr = {6 , 8 ,  4 ,  2 ,  7 ,  5};
        int[]oppoarr=new int[arr.length];
        int id=arr.length-1;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"-");
            while (id>=0){
                oppoarr[id]=arr[i];
                id--;
                break;
            }
        }
        System.out.println();
        for (int i=0;i< oppoarr.length;i++){
            System.out.print(oppoarr[i]+"-");
        }
    }
}
