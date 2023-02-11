package red.ex7;

public class SportsCar extends Vehicle implements RaceCompetitor{


    public SportsCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }

    @Override
    public int getDistance() {
        return 6;
    }

    @Override
    public int getCompetitionNumber() {
        return 99;
    }
}