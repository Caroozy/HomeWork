package hospital_system;

public abstract class Person {

    private static int count=1;

    private int id=count;

    private String name="Person"+count;

    private int age=(int)(Math.random()*103)+18;

    public Person() {count++;}

    public static int getCount() {return count;}

    public static void setCount(int count) {Person.count = count;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
