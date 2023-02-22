package purple.ex5;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class OceanStatistics {

    public static int totalNumOfTeeth(Ocean ocean) {
        int totalTeeth = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Shark) {
                totalTeeth += ((Shark) ocean.getEntities()[i]).getNumOfTeeth();
            }
        }
        return totalTeeth;
    }

    public static int totalLengthInMeters(Ocean ocean) {
        int totalLength = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                totalLength += ((Whale) ocean.getEntities()[i]).getLengthInMeters();
            }
        }
        return totalLength;
    }

    public static String mostPopular(Ocean ocean) {
        return (ocean.totalSharks() > ocean.totalWhales()) ? "Shark" : (ocean.totalSharks() < ocean.totalWhales() ? "Whale" : "Equals");
    }

    public static int avgNumOfTeeth(Ocean ocean) {
        int totalTeeth = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Shark) {
                totalTeeth += ((Shark) ocean.getEntities()[i]).getNumOfTeeth();
            }
        }
        return totalTeeth / ocean.totalSharks();
    }

    public static int avgLengthInMeters(Ocean ocean) {
        int totalLength = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                totalLength += ((Whale) ocean.getEntities()[i]).getLengthInMeters();
            }
        }
        return totalLength / ocean.totalWhales();
    }
}
