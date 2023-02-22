package purple.ex4;

import java.util.Arrays;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class DogGarden {

    private String name;
    private DogWalker[] dogWalkers = new DogWalker[5];

    public DogGarden() {
    }

    public DogGarden(String name, DogWalker[] dogWalkers) {
        this.name = name;
        this.dogWalkers = dogWalkers;
    }

    public DogGarden(DogGarden other) {
        this.name = other.name;
        this.dogWalkers = other.dogWalkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogWalker[] getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(DogWalker[] dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    @Override
    public String toString() {
        return "DogGarden{" +
                "name='" + name + '\'' +
                ", dogWalkers=" + Arrays.toString(dogWalkers) +
                '}';
    }
}
