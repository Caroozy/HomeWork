package series4;

import java.util.Arrays;

public class DogGarden {
    private String name;
    private DogWalker[]dogWalker=new DogWalker[5];

    public DogGarden() {
    }

    public DogGarden(String name, DogWalker[] dogWalker) {
        this.name = name;
        this.dogWalker = dogWalker;
    }
    public DogGarden(DogGarden dogGarden){
        this.name= dogGarden.name;
        this.dogWalker= dogGarden.dogWalker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogWalker[] getDogWalker() {
        return dogWalker;
    }

    public void setDogWalker(DogWalker[] dogWalker) {
        this.dogWalker = dogWalker;
    }

    @Override
    public String toString() {
        return "DogGarden{" +
                "name='" + name + '\'' +
                ", dogWalker=" + Arrays.toString(dogWalker) +
                '}';
    }
}
