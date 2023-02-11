package Task14unit7;

public class E8 {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                if (count==0){
                    arr[i][id]=0;
                    count++;
                }else{
                    arr[i][id]=1;
                    count--;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                System.out.print(arr[i][id]+"-");
            }
            System.out.println();
        }
    }
}
