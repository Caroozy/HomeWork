package Task14unit7;

public class E9 {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                if (i==0){
                    arr[i][id]=1;
                }else if(id==0){
                    arr[i][id]=1;
                }else if(i== arr.length-1){
                    arr[i][id]=1;
                }else if(id==arr.length-1){
                    arr[i][id]=1;
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
