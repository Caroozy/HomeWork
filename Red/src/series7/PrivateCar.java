package series7;

public class PrivateCar extends Vehicle implements RaceCompetitor {

    public PrivateCar(String manufacturer, String frameNumber) {
        super(manufacturer, frameNumber);
    }

    @Override
    public int getDistance() {
        return 2;
    }

    @Override
    public int getCompetitionNumber() {
        return 0;
    }

}
