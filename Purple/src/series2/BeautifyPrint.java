package series2;

public class BeautifyPrint {
    public static void draw(FullYear fullYear){
        for (int i=0;i<fullYear.getDates().length;i++){
            System.out.println(fullYear.getDates()[i]);
        }
    }
}
