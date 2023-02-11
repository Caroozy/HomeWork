package Task14unit5;

public class E9 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 ,  0 ,  1 ,  9 ,  0 ,  0 , 0 ,  0};
        int sum=0;
        int id;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                sum=sum*10+arr[i];
            }else{
                for (id=i;id<arr.length;id++){
                    if(arr[id]!=0){
                        break;
                    }
                }
                if (id!= arr.length){
                    while(id-i!=0){
                        sum*=10;
                        id--;
                    }
                }else{
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
