package purple.ex4;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class Test {

    public static void main(String[] args) {
        DogGarden dogGarden = new DogGarden(DogFactory.initDogGarden());
        System.out.println(dogGarden);
    }
}
