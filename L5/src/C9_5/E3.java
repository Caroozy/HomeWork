package C9_5;

public class E3 {
    public static void main(String[] args) {
        int num= (int)(Math.random()*251)+100;
        int h = num/60;
        int m = num%60;
        System.out.println("the movie is " +h+" hours and "+m+"minutes");
        System.out.println(num);
    }
}
