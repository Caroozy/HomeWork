package Task14unit1;

public class E1 {
    public static void main(String[] args) {
        int counta=0;
        int countb=0;
        char[] arr = {'a','b','c','a','b','d','r','c'};
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                counta++;
            }
            if(arr[i]=='c'){
                countb++;
            }
        }
        System.out.println("a comes up "+counta+" times");
        System.out.println("a and c come up "+(counta+countb)+" times");
    }
}
