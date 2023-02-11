package red.ex7;

public class Competition {

    public static int go(RaceCompetitor[] competitors) {
        int maxDistance = 0;
        int winnerId = 0;
        for (RaceCompetitor comp : competitors) {

            if (comp.getDistance() > maxDistance) {
                maxDistance = comp.getDistance();
                winnerId = comp.getCompetitionNumber();
            }

            for (int i = 0; i < comp.getDistance(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }

        return winnerId;
    }
}
