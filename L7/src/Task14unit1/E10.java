package Task14unit1;

public class E10 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int bot = Integer.MAX_VALUE;
        int botchar=0;
        int maxchar = 0;
        int sum = 0;
        int i;
        int evensum = 0;
        int oddsum = 0;
        int[] arr = new int[100];
        for (i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100)+1;
            if (arr[i] > max) {
                max = arr[i];
                maxchar = i + 1;
            } else if (arr[i] < bot) {
                bot=arr[i];
                botchar=i+1;
            }
            sum+=arr[i];
            if (arr[i]%2==0){
                evensum+=arr[i];
            }else {
                oddsum+=arr[i];
            }
            System.out.print(arr[i]+"-");
        }
        System.out.println();
        System.out.println("the top number is: "+max+" at the spot "+maxchar+" and the bot number is: "+bot+" at the spot "+botchar);
        System.out.println("the summary is: "+sum+" and the average is: "+(sum/i));
        System.out.println("the odd number summary is: "+oddsum+ " and the even number summary is: "+evensum);
    }
}
