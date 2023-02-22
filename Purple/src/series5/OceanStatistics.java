package series5;

public class OceanStatistics {
    public static int totalTeeth(Ocean ocean){
        int count =0;
        for (int i=0;i< ocean.totalEntities();i++){
            if(ocean.getEntities()[i] instanceof Shark){
                count+=(((Shark) ocean.getEntities()[i]).numOfTeeth);
            }
        }
        return count;
    }
    public static int totalLength(Ocean ocean){
        int count =0;
        for (int i=0;i<ocean.totalEntities();i++){
            if (ocean.getEntities()[i] instanceof Whale){
                count+=(((Whale) ocean.getEntities()[i]).lengthInMeters);
            }
        }
        return count;
    }

    public static String topFish(Ocean ocean){
        if (ocean.totalSharks()==ocean.totalWhales()){
            return "Even";
        }else if(ocean.totalSharks()> ocean.totalWhales()){
            return "Sharks";
        }
        return "Whales";
    }
    public static float avgTeeth(Ocean ocean){
        return totalTeeth(ocean)/ocean.totalSharks();
    }
    public static float avgLength(Ocean ocean){
        return totalLength(ocean)/ ocean.totalWhales();
    }

}
