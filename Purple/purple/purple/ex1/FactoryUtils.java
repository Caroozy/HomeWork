package purple.ex1;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class FactoryUtils {

    private static int countPerson = 1;
    private static String[] cities = {"TLV", "HFA", "JLM"};

    public static Group initGroup() {
        return new Group(initPeople(3, 7));
    }

    public static Group initGroup(boolean isSmoking) {
        if (isSmoking) {
            return new Group(initPeople(10, 0));
        }
        return new Group(initPeople(0, 10));

        //return (isSmoking) ? new Group(initPeople(10,0)): new Group(initPeople(0,10));

    }

    public static Person initPerson(boolean isSmoking) {
        int id = countPerson;
        String firstName = "John " + id;
        String lastName = "Bryce " + id;
        String city = cities[(int) (Math.random() * 3)];
        countPerson++;
        return new Person(id, lastName, firstName, city, isSmoking);
    }

    public static Person[] initPeople(int smokers, int nonSmokers) {
        int len = smokers + nonSmokers;
        Person[] people = new Person[len]; // [null, null....null]
        int idx = 0;
        for (idx = 0; idx < smokers; idx++) {
            people[idx] = initPerson(true);
        }
        for (idx = idx; idx < len; idx++) {
            people[idx] = initPerson(false);
        }

        return people;
    }
}
