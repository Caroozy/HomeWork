package series1;

public class GroupStat {
    public static int numOfSmokers(Group group){
        int count=0;
        for (int i=0;i<group.getPeople().length;i++){
            if (group.getPeople()[i].isSmoking()){
                count++;
            }
        }
        return count;
    }
    public static int numOfLiving(Group group,String city){
        int count=0;
        for (int i=0;i<group.getPeople().length;i++){
            if (group.getPeople()[i].getCity()==city){
                count++;
            }
        }
        return count;
    }
}
