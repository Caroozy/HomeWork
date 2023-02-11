package Task14unit7;

public class E6 {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        for(int i=0;i< arr.length;i++){
            for (int id=0;id< arr[i].length;id++){
                arr[i][id]=(int)(Math.random()*101)+100;
                if (arr[i][id]%5==0|| arr[i][id]%7==0){
                    System.out.println("the number "+arr[i][id]+" has been reset to 0!");
                    arr[i][id]=0;
                }
            }
        }
        System.out.println();
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                System.out.print(arr[i][id]+"-");
            }
            System.out.println();
        }
    }
}
