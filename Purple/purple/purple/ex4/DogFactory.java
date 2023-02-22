package purple.ex4;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class DogFactory {

    public static Dog initDog() {
        String name = ConstantFactory.randomDogName();
        float weight = ConstantFactory.randomWeight();
        String color = ConstantFactory.randomColor();
        int val = (int) (Math.random() * 10);
        boolean isVaccinated = val != 0 && val != 1;
        return new Dog(name, weight, color, isVaccinated);
    }

    public static Dog[] initDogs(int len) {
        Dog[] dogs = new Dog[len];
        for (int i = 0; i < len; i++) {
            dogs[i] = initDog();
        }
        return dogs;
    }

    public static DogWalker initDogWalker(String name) {
        return new DogWalker(name,initDogs(5));
    }

    public static DogWalker[] initDogWalkers(int len) {
        DogWalker[] dogWalkers = new DogWalker[len];
        for (int i = 0; i < len; i++) {
            dogWalkers[i] =initDogWalker(ConstantFactory.randomHumanName());
        }

        return dogWalkers;
    }

    public static DogGarden initDogGarden() {
        String gardenName = ConstantFactory.randomGardenName();
        DogWalker[] dogWalkers = initDogWalkers(25);

        return new DogGarden(gardenName,dogWalkers);
    }
}
