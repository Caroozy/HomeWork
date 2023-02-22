package purple.ex5;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class OceanReport {

    public static void report(Ocean ocean){
        System.out.println("Total Teeth : "+OceanStatistics.totalNumOfTeeth(ocean) );
        System.out.println("Total length : "+OceanStatistics.totalLengthInMeters(ocean) );

        System.out.println("Avg Teeth : "+OceanStatistics.avgNumOfTeeth(ocean) );
        System.out.println("Avg length : "+OceanStatistics.avgLengthInMeters(ocean) );
        System.out.println("Most Popular : "+OceanStatistics.mostPopular(ocean));
    }
}
