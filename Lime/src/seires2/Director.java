package seires2;

public class Director extends Manager {
    private String group;

    public Director(String name, double salary, String department, String group) {
        super(name, salary, department);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString()+ " Type: Director{" +
                "group='" + group + '\'' +
                '}';
    }

    @Override
    void draw() {
        System.out.println("      ,\n" +
                "            ,:' `..;\n" +
                "            `. ,;;'%\n" +
                "            +;;'%%%%%\n" +
                "             /- %,)%%\n" +
                "             `   \\ %%\n" +
                "              =  )/ \\\n" +
                "              `-'/ / \\\n" +
                "                /\\/.-.\\\n" +
                "               |  (    |\n" +
                "               |  |   ||\n" +
                "               |  |   ||\n" +
                "           _.-----'   ||\n" +
                "          / \\________,'|\n" +
                "         (((/  |       |\n" +
                "         //    |       |\n" +
                "        //     |\\      |\n" +
                "       //      | \\     |\n" +
                "      //       |  \\    |\n" +
                "     //        |   \\   |\n" +
                "    //         |    \\  |\n" +
                "   //          |    |\\ |\n" +
                "  //           |    | \\|\n" +
                " //            \\    \\\n" +
                "c'             |\\    \\\n" +
                "               | \\    \\\n" +
                "               |  \\    \\\n" +
                "               |.' \\    \\\n" +
                "              _\\    \\.-' \\    \n" +
                "             (___.-(__.'\\/");
    }
}
