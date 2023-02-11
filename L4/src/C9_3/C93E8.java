package C9_3;

public class C93E8 {
    public static void main(String[] args) {
        int h=(int)(Math.random()*30)+1;
        int w=(int)(Math.random()*(h-1))+1;
        int p=2*h+2*w;
        int a=h*w;
        System.out.println("height " +h);
        System.out.println("width " +w);
        System.out.println("perimeter " +p);
        System.out.println("area " +a);
    }
}
