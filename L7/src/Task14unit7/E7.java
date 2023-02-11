package Task14unit7;

public class E7 {
    public static void main(String[] args) {
        int top=Integer.MIN_VALUE;
        int topidx=0;
        int sum=0;
        int[][]arr=new int[10][10];
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                arr[i][id]=(int)(Math.random()*101)+100;
                sum+=arr[i][id];
            }
            if (sum>top){
                topidx=i;
                top=sum;
            }
            sum=0;
        }
        System.out.println("the top summary line is line: "+(topidx+1));
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[topidx][i]+"-");
        }
    }
}
