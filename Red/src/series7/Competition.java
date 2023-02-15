package series7;

public class Competition {
    public static int go(RaceCompetitor[]competitors){

        int top=0;

        for (int i=0;i< competitors.length;i++){
            for (int id=0;id<competitors[i].getDistance();id++){
                System.out.print("-");
            }
            System.out.println();
            if (competitors[top].getDistance()<competitors[i].getDistance()){
                top=i;
            }
        }
        return top;
    }
}
