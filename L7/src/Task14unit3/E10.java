package Task14unit3;

public class E10 {
    public static void main(String[] args) {
        int[]arr=new int[100];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
            while(arr[i]%2!=0){
                arr[i]=(int)(Math.random()*100)+1;
            }
            System.out.print(arr[i]+"-");
        }
    }
}
