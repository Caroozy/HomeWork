package purple.ex1;

import java.util.Arrays;

import static purple.ex1.GroupStat.*;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class ReportUtils {

    public static void info(Group group) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@Welcome to Report Group@@@@@@@@@@@@@@@@@@@@");
        System.out.println("group id : " + group.getId());
        System.out.println("group name : " + group.getName());
        System.out.println("people :");
        System.out.println(Arrays.toString(group.getPeople()));
        System.out.println("---------------------------------------------------------------");
        System.out.println("num of smokers    : " + numOfSmokers(group));
        System.out.println("num of telavivian : " + numOfTelavivan(group));
        System.out.println("num of Hafanina : " + numOfLiving(group, "HFA"));
        System.out.println("num of Jerusalmian : " + numOfLiving(group, "JLM"));

    }
}
