package purple.ex1;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {

        Group g1 = FactoryUtils.initGroup();
        ReportUtils.info(g1);
    }
}
