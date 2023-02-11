package C9_3;

public class C93E3 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(num);
    }
}
