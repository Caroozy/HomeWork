package series7;

public class SportsCar extends Vehicle implements RaceCompetitor{

    public SportsCar(String manufacturer, String frameNumber) {
        super(manufacturer, frameNumber);
    }

    @Override
    public int getDistance() {
        return 6;
    }

    @Override
    public int getCompetitionNumber() {
        return 0;
    }
}
