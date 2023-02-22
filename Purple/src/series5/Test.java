package series5;

public class Test {
    public static void main(String[] args) {
        Ocean c1=new Ocean();
        System.out.println("Shark teeth in the ocean: "+OceanStatistics.totalTeeth(c1));
        System.out.println("Whale meters in the ocean: "+OceanStatistics.totalLength(c1));
        System.out.println("There are more "+OceanStatistics.topFish(c1)+ " in the ocean");
        System.out.println("The average of shark teeth in the ocean: "+OceanStatistics.avgTeeth(c1));
        System.out.println("The average meters of whale in the ocean: "+OceanStatistics.avgLength(c1));
    }
}
