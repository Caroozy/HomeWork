import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]arr={25,14,56,15,36,56,77,18,29,49};
        System.out.println("choose a number and press 0 anytime to stop");
        int choiceNumber= scanner.nextInt();
        while (choiceNumber!=0){
            while (choiceNumber>Integer.MAX_VALUE||choiceNumber<Integer.MIN_VALUE){
                System.out.println("choose a normal number");
                choiceNumber= scanner.nextInt();
            }
            System.out.println("choose his index");
            int choiceIndex= scanner.nextInt();
            while (choiceIndex>=arr.length||choiceIndex<0){
                System.out.println("choose a normal index");
                choiceIndex= scanner.nextInt();
            }
            System.arraycopy(arr,choiceIndex,arr,choiceIndex+1,arr.length-choiceIndex-1);
            arr[choiceIndex]=choiceNumber;
            System.out.println();
            for (int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("choose a number and press 0 anytime to stop");
            choiceNumber= scanner.nextInt();
        }
    }
}
