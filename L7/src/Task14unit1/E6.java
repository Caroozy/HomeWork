package Task14unit1;

public class E6 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*90)+10;
            System.out.print(arr[i]+"-");
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println();
        System.out.println("the max number is "+max);
    }
}
