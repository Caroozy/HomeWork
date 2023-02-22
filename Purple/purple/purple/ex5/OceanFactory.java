package purple.ex5;

import java.util.Random;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class OceanFactory {

    public static Shark initShark(){
        return new Shark(ConstantFactory.rand(40,130));
    }

    public static Whale initWhale(){
        return new Whale(ConstantFactory.rand(1000,1500));
    }


    public static Fish initFish(){
        return (new Random().nextBoolean())?OceanFactory.initShark():OceanFactory.initWhale();
    }

    public static Fish[] init(int len){
        Fish[] entities = new Fish[len];
        for (int i = 0; i < entities.length; i++) {
            entities[i] = OceanFactory.initFish();
        }

        return entities;
    }
}
