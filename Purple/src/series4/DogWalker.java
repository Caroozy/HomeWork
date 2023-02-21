package series4;

import series2.Date;

import java.util.Arrays;

public class DogWalker {
    private String name;
    private Dog[]dogs=new Dog[5];

    public DogWalker() {
    }

    public DogWalker(DogWalker dogWalker){
        this.name= dogWalker.name;
        this.dogs= dogWalker.dogs;
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
