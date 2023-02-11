package Task14unit7;

public class E4 {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        int num=0;
        for(int i=0;i< arr.length;i++){
            for (int id=0;id<arr[i].length;id++){
                System.out.print(num+"-");
                num++;
            }
            System.out.println();
        }
    }
}
