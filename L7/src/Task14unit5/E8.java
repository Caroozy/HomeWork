package Task14unit5;

public class E8 {
    public static void main(String[] args) {
        int tmp;
        int[] arr = {1 , 2 ,  5 ,  1 ,  6 ,  1 ,  5 , 4 ,  8};
        for(int i=0;i<arr.length-1;i++){
            for(int id=0;id<arr.length-i-1;id++){
                if(arr[id]>arr[id+1]){
                    tmp=arr[id+1];
                    arr[id+1]=arr[id];
                    arr[id]=tmp;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"-");
        }
    }
}
