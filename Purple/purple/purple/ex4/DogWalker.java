package purple.ex4;

import java.util.Arrays;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class DogWalker {

    private String name;
    private Dog[] dogs = new Dog[5];

    public DogWalker() {
    }

    public DogWalker(DogWalker other) {
        this.name = other.name;
        this.dogs = other.dogs;
    }

    public DogWalker(String name, Dog[] dogs) {
        this.name = name;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "DogWalker{" +
                "name='" + name + '\'' +
                ", dogs=" + Arrays.toString(dogs) +
                '}';
    }
}
