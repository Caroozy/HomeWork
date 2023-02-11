package Task14unit1;

public class E8 {
    public static void main(String[] args) {
        int sum=0;
        int[]arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*90)+10;
            System.out.print(arr[i]+"-");
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("the summary of the numbers is: "+sum);
    }
}
