package series1;

import java.util.Arrays;

public class Group {
    private static int count=1;
    private  int id=count;
    private Person[]people;
    private  String name="Group "+count;

    public Group(){
        this.people=new Person[10];
    }
    public Group(Person[]people){
        this.people=people;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
    public int healthScore(Person[]people){
        int counter=0;
        for (int i=0;i< people.length;i++){
            if (people[i].isSmoking()){
                counter++;
            }
        }
        return counter;
    }
}
