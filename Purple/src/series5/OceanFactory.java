package series5;

public class OceanFactory {
    public static Shark initShark(){
        Shark s1=new Shark((int)(Math.random()*501)+1000);
        return s1;
    }

    public static Whale initWhale(){
        Whale w1=new Whale((int)(Math.random()*91)+40);
        return w1;
    }
    public static Fish initFish(){
        int rand=(int) (Math.random()*2);
        switch (rand){
            case 0:
                return initWhale();
        }
        return initShark();
    }
    public static Fish[] init(int len){
        Fish[]fish=new Fish[len];
        for (int i=0;i< fish.length;i++){
            fish[i]=initFish();
        }
        return fish;
    }
}
