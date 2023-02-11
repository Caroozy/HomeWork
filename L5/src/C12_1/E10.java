package C12_1;

public class E10 {
    public static void main(String[] args) {
      int max=(int)(Math.random()*100)+1;
      int den=(int)(Math.random()*100)+1;
      int tmp;
      if(den>max){
          tmp=den;
          den=max;
          max=tmp;
      }
        System.out.println("the numbers are: "+max+" "+den);
      for(int idx=den;idx<=max;idx+=idx){
          System.out.print(idx+"-");
      }
    }
}
