package Task14unit7;

public class E10 {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                arr[i][id]=(int)(Math.random()*10);
            }
        }
        for (int i=0;i< arr.length;i++){
            for(int id=0;id< arr.length;id++){
                System.out.print(arr[i][id]+"-");
            }
            System.out.println();
        }
        System.out.println();
        int sumoriginal=0;
        int sumtmp=0;
        for (int i=0;i< arr.length;i++){
            sumoriginal=+arr[0][i];  //counting lines
        }
        System.out.println(sumoriginal);
        for (int i =1;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                sumtmp=+arr[i][id];
            }
            System.out.println(sumtmp);
            if (sumtmp!=sumoriginal){
                System.out.println("not a perfect cube");
                return;
            }
            sumtmp=0;
        }
        for(int i=0;i< arr.length;i++){
            sumtmp+=arr[i][0];
        }
        System.out.println(sumtmp);
        if (sumtmp!=sumoriginal){
            System.out.println("not a perfect cube");
            return;
        }
        sumtmp=0;
        for (int i=1;i< arr.length;i++){
            for (int id=0;id< arr.length;i++){
                sumtmp+=arr[id][i];
            }
            System.out.println(sumtmp);
            if (sumoriginal!=sumtmp){
                System.out.println("not a perfect cube");
                return;
            }
            sumtmp=0;
        }
        int count=0;
        for(int i=0;i< arr.length;i++){
            sumtmp+=arr[i][count];
            count++;
        }
        System.out.println(sumtmp);
        if (sumtmp!=sumoriginal){
            System.out.println("not a perfect cube");
            return;
        }
        sumtmp=0;
        count=0;
        for(int i=0;i< arr.length;i++){
            sumtmp+=arr[i][arr.length-1-count];
            count++;
        }
        System.out.println(sumtmp);
        if (sumtmp!=sumoriginal){
            System.out.println("not a perfect cube");
        }else{
            System.out.println("a perfect cube");
        }
    }
}
