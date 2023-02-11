package Task14unit7;

public class E5 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        arr[0][0] = 1;
        for (int i=0;i< arr.length-1;i++){
            for(int id=0;id< arr.length-1;id++){
                if (arr[i][id]==1){
                    arr[i+1][id+1]=1;
                    break;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                if (arr[i][id]==1){
                    arr[i][arr.length-1-id]=1;
                }
            }
        }
        for (int i=0; i < arr.length; i++) {
            for (int id = 0; id < arr.length; id++) {
                System.out.print(arr[i][id] + "-");
            }
            System.out.println();
        }
    }
}