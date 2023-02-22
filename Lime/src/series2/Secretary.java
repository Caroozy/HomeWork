package series2;

public class Secretary extends Employee {

    private String office;

    public Secretary(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString()+" Type: Secretary{" +
                "office='" + office + '\'' +
                '}';
    }

    void draw() {
        System.out.println("   w*W*W*W*w\n" +
                "         \\\".\".\"/\n" +
                "          //`\\\\\n" +
                "         (/a a\\)\n" +
                "         (\\_-_/) \n" +
                "        .-~'='~-.\n" +
                "       /`~`\"Y\"`~`\\\n" +
                "      / /(_ * _)\\ \\\n" +
                "     / /  )   (  \\ \\\n" +
                "     \\ \\_/\\\\_//\\_/ / \n" +
                "      \\/_) '*' (_\\/\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        |       |\n" +
                "        w*W*W*W*w");
    }
}
