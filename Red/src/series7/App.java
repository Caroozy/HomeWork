package series7;

public class App {
    public static void main(String[] args) {
        RaceCompetitor[]competitors=new RaceCompetitor[2];
        competitors[0]=new PrivateCar("Mazda", "I056T7Y");
        competitors[1]=new SportsCar("lamborghini", "T95POWER99");
        int winner=Competition.go(competitors);
        System.out.println( "the winner is: " +winner);
    }

}
