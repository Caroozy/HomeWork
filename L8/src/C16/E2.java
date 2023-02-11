package C16;

public class E2 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            positive();
        }
    }
    public static void positive(){
        for (int i=2;i<=200;i+=2){
            System.out.print(i+"-");
        }
        System.out.println();
    }
}
