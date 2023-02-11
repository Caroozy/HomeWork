package Task14unit1;

public class E9 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        int sum=0;
        int i;
        for(i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*90)+10;
            System.out.print(arr[i]+"-");
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("the average is: "+(sum/i));
    }
}
