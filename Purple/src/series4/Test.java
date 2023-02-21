package series4;

public class Test {
    public static void main(String[] args) {
        DogGarden dogGarden=new DogGarden();
        dogGarden=DogFactory.initDogGarden();
        print(dogGarden);
    }
    public static void print(DogGarden dogGarden){
        System.out.println(dogGarden.getName());
        System.out.println("-------------------------------------------------------------------------");
        for (int i=0;i<dogGarden.getDogWalker().length;i++){
            System.out.println((i+1)+"-- "+dogGarden.getDogWalker()[i].getName()+" and his dogs:");
            System.out.println("-------------------------------------------------------------------------");
            for (int id=0;id<dogGarden.getDogWalker()[i].getDogs().length;id++){
                System.out.println(dogGarden.getDogWalker()[i].getDogs()[id].toString());
                System.out.println("-------------------------------------------------------------------------");
            }
        }
    }
}
