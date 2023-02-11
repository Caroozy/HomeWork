package Task14unit1;

public class E7 {
    public static void main(String[] args) {
        int bot=Integer.MAX_VALUE;
        int[]arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*90)+10;
            System.out.print(arr[i]+"-");
            if(bot>arr[i]){
                bot=arr[i];
            }
        }
        System.out.println();
        System.out.println("the bottom number is: "+bot);
    }
}
