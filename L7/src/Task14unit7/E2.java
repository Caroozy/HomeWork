package Task14unit7;

public class E2 {
    public static void main(String[] args) {
        int[][]arr=new int[10][4];
        int top=Integer.MIN_VALUE;
        int topidx=0;
        int bot=Integer.MAX_VALUE;
        int botidx=0;
        int sum=0;
        int sumtotal=0;
        for(int i=0;i< arr.length;i++){
            for (int id=0;id<arr[i].length;id++){
                arr[i][id]=(int)(Math.random()*121);
                sum+=arr[i][id];
            }
            System.out.println("the average age in apartment "+(i+1)+" is: "+(sum/arr[i].length));
            if(sum>top){
                top=sum;
                topidx=i+1;
            }else if(sum<bot){
                bot=sum;
                botidx=i+1;
            }
            sumtotal+=sum;
            sum=0;
        }
        System.out.println("oldest apartment is: "+topidx);
        System.out.println("with the average age of: "+(top/arr[0].length));
        System.out.println("youngest apartment is: "+botidx);
        System.out.println("with the average age of: "+(bot/arr[0].length));
        System.out.println();
        System.out.println("the average age of the building is: "+(sumtotal/40));

    }
}
