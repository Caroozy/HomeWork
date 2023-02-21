package series4;

public class DogFactory {
    public static Dog initDog(){
        Dog d1=new Dog(ConstantFactory.randomDogName(),ConstantFactory.randomWeight(),ConstantFactory.randomColor(),randomVaccine());
        return d1;
    }
    public static Dog[]initDogs(int len){
        Dog[]dogs=new Dog[len];
        for (int i=0;i< dogs.length;i++){
            dogs[i]=new Dog(initDog());
        }
        return dogs;
    }


    private static boolean randomVaccine(){
        int i=(int)(Math.random()*10);
        if (i>=2){
            return true;
        }
        return false;
    }

    public static DogWalker dogWalker(String name){
        DogWalker d1=new DogWalker();
        d1.setName(name);
        d1.setDogs(initDogs(d1.getDogs().length));
        return d1;
    }

    public static DogWalker[]initDogWalkers(int len){
        DogWalker[]dogWalkers=new DogWalker[len];
        for (int i=0;i< dogWalkers.length;i++){
            dogWalkers[i]=new DogWalker(dogWalker(ConstantFactory.randomHumanName()));
        }
        return dogWalkers;
    }

    public static DogGarden initDogGarden(){
        DogGarden d1=new DogGarden();
        d1.setName(ConstantFactory.randomGardenName());
        d1.setDogWalker(initDogWalkers(25));
        return d1;
    }
}
