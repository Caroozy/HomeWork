package series2;

public class Engineer extends Employee {
    private String speciality;

    public Engineer(String name, double salary, String speciality) {
        super(name, salary);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString()+ " Type: Engineer{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
    public void draw(){
        System.out.println(" ////^\\\\\\\\\n" +
                "      | ^   ^ |\n" +
                "     @ (o) (o) @\n" +
                "      |   <   |\n" +
                "      |  ___  |\n" +
                "       \\_____/\n" +
                "     ____|  |____\n" +
                "    /    \\__/    \\\n" +
                "   /              \\\n" +
                "  /\\_/|        |\\_/\\\n" +
                " / /  |        |  \\ \\\n" +
                "( <   |        |   > )\n" +
                " \\ \\  |        |  / /\n" +
                "  \\ \\ |________| / /\n" +
                "   \\ \\|");
    }
}
