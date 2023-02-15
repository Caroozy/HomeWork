package series1;

public class ReportUtils {
    public static void info(Group group){
        System.out.println("Nm.Of smokers: "+GroupStat.numOfSmokers(group));
        System.out.println("Nm.Of living in TLV: "+GroupStat.numOfLiving(group,"TLV"));
        System.out.println("Nm.Of living in JLM: "+GroupStat.numOfLiving(group,"JLM"));
        System.out.println("Nm.Of living in HFA: "+GroupStat.numOfLiving(group,"HFA"));
    }
}

