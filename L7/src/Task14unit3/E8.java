package Task14unit3;

public class E8 {
    public static void main(String[] args) {
        int[]arr=new int[15];
        int tmp;
        arr[0]=1;
        arr[1]=1;
        System.out.print(arr[0]+"-");
        for(int i=1;i< arr.length;i++){
            System.out.print(arr[i]+"-");
            arr[(i+1)]=arr[i]+arr[(i-1)];
        }
    }
}
