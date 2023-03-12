package e1;

public class Track {

    private String name;

    private String bandName;

    private double price;

    private int lengthInSeconds;

    public Track(String name, String bandName, double price, int lengthInSeconds) {
        this.name = name;
        this.bandName = bandName;
        this.price = price;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getName() {
        return name;
    }

    public String getBandName() {
        return bandName;
    }

    public double getPrice() {
        return price;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    @Override
    public String toString() {
        return "e1.Track{" +
                "name='" + name + '\'' +
                ", bandName='" + bandName + '\'' +
                ", price=" + price +
                ", lengthInSeconds=" + lengthInSeconds +
                '}' +'\n';
    }
}
