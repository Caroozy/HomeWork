package series1;

public class FactoryUtils {
    private static int count = 1;

    public static Group initGroup() {
        Group g1 = new Group();
        for (int i=0;i<g1.getPeople().length;i++){
            g1.getPeople()[i]=initPerson(false);
        }
        for (int i = 0; i < 3; i++) {
            g1.getPeople()[i].setSmoking(true);
        }
        return g1;
    }

    public static Group initGroup(boolean isSmoking) {
        Group g1 = new Group();
        for (int i = 0; i < g1.getPeople().length; i++) {
            g1.getPeople()[i]=initPerson(isSmoking);
        }
        return g1;
    }

    public static Person initPerson(boolean isSmoking) {

        Person p1 = new Person();
        p1.setCity(randomCity());
        p1.setFirstName("John " + count);
        p1.setLastName("Bryce " + count);
        p1.setId(count);
        p1.setSmoking(isSmoking);
        count++;
        return p1;
    }

    public static String randomCity() {
        String city = null;
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                city = "TLV";
                break;
            case 1:
                city = "JLM";
                break;
            case 2:
                city = "HFA";
                break;
        }
        return city;
    }

}

