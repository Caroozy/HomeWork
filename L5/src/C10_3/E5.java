package C10_3;

public class E5 {
    public static void main(String[] args) {
        int sal=(int)(Math.random()*120000)+1;
        float neto;
        System.out.println(sal);
        if(sal>=50001){
            if(sal<100001){
                neto=sal*0.7f;
            }else{
                neto=sal*0.6f;
            }
        }else{
            if(sal>23000){
                neto=sal*0.8f;
            }else{
                neto=sal*0.9f;
            }
        }
        System.out.println("your neto salary will be: "+(int)neto);
    }
}
