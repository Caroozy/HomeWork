package Task14unit3;

public class E2 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*101);
            System.out.print(arr[i]+"-");
        }
    }
}
