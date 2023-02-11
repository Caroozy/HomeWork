package red.ex7;

public class PrivateCar extends Vehicle implements RaceCompetitor{


    public PrivateCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }

    @Override
    public int getDistance() {
        return 2;
    }

    @Override
    public int getCompetitionNumber() {
        return 88;
    }
}
