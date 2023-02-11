package C16;

public class E3 {
    public static void main(String[] args) {
        f1();
        System.out.println("________________");
        f2();
        System.out.println("__________________");
        f3();
    }
    public static void f1(){
        System.out.println("f1");
        f2();
    }
    public static void f2(){
        System.out.println("f2");
        f3();
    }
    public static void f3(){
        System.out.println("f3");
    }
}
