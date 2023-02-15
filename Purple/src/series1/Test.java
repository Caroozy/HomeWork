package series1;

public class Test {
    public static void main(String[] args) {
        Group g1=FactoryUtils.initGroup();
        Group g2=FactoryUtils.initGroup(true);
        Group g3=new Group();
        for (int i=0;i<g3.getPeople().length;i++){
            g3.getPeople()[i]=FactoryUtils.initPerson(smokingRandom());
        }
        ReportUtils.info(g1);
        ReportUtils.info(g2);
        ReportUtils.info(g3);
    }
    private static boolean smokingRandom(){
        int num=(int)(Math.random()*2);
        switch (num){
            case 0:
                return true;
            case 1:
                return false;

        }
        return false;
    }
}
