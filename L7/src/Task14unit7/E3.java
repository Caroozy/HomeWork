package Task14unit7;

public class E3 {
    public static void main(String[] args) {
        int[][]arr=new int[50][12];
        int top=Integer.MIN_VALUE;
        int topidx=0;
        int bot=Integer.MAX_VALUE;
        int botidx=0;
        int sum=0;
        int sumtotal=0;
        for(int i=0;i< arr.length;i++){
            System.out.println("worker number: "+(i+1));
            for (int id=0;id<arr[i].length;id++){
                arr[i][id]=(int)(Math.random()*3001)+14000;
                System.out.println(" salary is worth: "+arr[i][id]);
                sum+=arr[i][id];

            }
            System.out.println("the average worker "+(i+1)+" salary is: "+(sum/arr[i].length));
            sumtotal+=sum;
            if((sum/arr[i].length)>top){
                top=sum/arr[i].length;
                topidx=i+1;
            }else if((sum/arr[i].length)<bot){
                bot=sum/arr[i].length;
                botidx=i+1;
            }
            sum=0;
            System.out.println("__________________________________");
        }
        System.out.println();
        System.out.println("the average salary is: "+(sumtotal/ (arr.length*arr[0].length)));
        System.out.println("the top salary is: "+ top+" earned by worker: "+topidx);
        System.out.println("the bot salary is: "+bot+" earned by worker: "+botidx);
    }
}
