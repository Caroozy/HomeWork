package C10_3;

public class E4 {
    public static void main(String[] args) {
        int bot=(int)(Math.random()*101);
        int top=(int)(Math.random()*101);
        int mid =(int)(Math.random()*101);
        int tmp;
        if(bot>top){
            if(bot>mid){
                tmp=top;
                top=bot;
                if(tmp>mid){
                    bot=mid;
                    mid=tmp;
                }else{
                    bot=tmp;
                }
            }
        }else if(mid<bot||mid>top){
            if(mid<bot){
                tmp=mid;
                mid=bot;
                bot=tmp;
            }else{
                tmp=mid;
                mid=top;
                top=tmp;
            }
        }
        System.out.println("bot mid top");
        System.out.println(bot+"  "+ mid +"  "+top);
        System.out.println("top number is: "+top);
        System.out.println("bottom number three times himself: "+(bot*bot*bot));
        System.out.println("middle number is: "+mid);
    }
}
