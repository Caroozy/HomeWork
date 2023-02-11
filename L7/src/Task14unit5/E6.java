package Task14unit5;

public class E6 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 ,  5 ,  1 ,  6 ,  1 ,  5 , 4 ,  8};
        int[]arrtmp=new int[arr.length];
        int rescount=0;
        int id;
        for(int i=0;i<arr.length;i++){
            for(id=0;id<arr.length;id++){
                if (arr[i]==arrtmp[id]){
                    break;
                }
            }
            if(id==arr.length){
                arrtmp[rescount]=arr[i];
                rescount++;
            }
        }
        int[]res=new int[rescount];
        for(int i=0;i<res.length;i++){
            res[i]=arrtmp[i];
            System.out.print(res[i]+"-");
        }
    }
}
