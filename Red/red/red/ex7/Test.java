package red.ex7;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        RaceCompetitor[] competitors = new RaceCompetitor[3];

        competitors[0]= new PrivateCar("Mazda", UUID.randomUUID().toString());
        competitors[1]= new SportsCar("Ferarri", UUID.randomUUID().toString());
        competitors[2]=new RaceCompetitor() {
            @Override
            public int getDistance() {
                return 5;
            }

            @Override
            public int getCompetitionNumber() {
                return 77;
            }
        };

        int winner = Competition.go(competitors);
        System.out.printf("And the winner is %d",winner);
    }
}
