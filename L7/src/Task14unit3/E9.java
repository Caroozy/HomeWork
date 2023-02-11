package Task14unit3;

public class E9 {
    public static void main(String[] args) {
        int[]arr=new int[15];
        arr[0]=1;
        arr[1]=1;
        int sume=0;
        int sumo=1;
        System.out.print("1-");
        for (int i=1;i< arr.length;i++){
            System.out.print(arr[i]+"-");
            if (arr[i]%2==0){
                sume+=arr[i];
            }else{
                sumo+=arr[i];
            }
            if(i<arr.length-1){
                arr[(i+1)]=arr[i]+arr[(i-1)];
            }
        }
        System.out.println();
        System.out.println("the sum of the odd numbers is: "+sumo+ " and the sum of even numbers is: "+sume);
        System.out.println(sume>sumo?"the greater sum is the even numbers: "+sume:"the greater sum is the odd numbers:"+sumo);
    }
}
