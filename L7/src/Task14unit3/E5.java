package Task14unit3;

public class E5 {
    public static void main(String[] args) {
        int sum=0;
        int[]arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*101);
            if (arr[i]%2==0){
                System.out.println(arr[i]);
                sum+=arr[i];
            }
        }
        System.out.println("the summary of even numbers is: "+sum);
    }
}
