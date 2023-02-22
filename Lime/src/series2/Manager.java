package series2;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+ " Type: Manager{" +
                "department='" + department + '\'' +
                '}';
    }

    void draw() {
        System.out.println(" dS$$S$S$S$S$S$S$$Sb                    \n" +
                "                   :$$S^S$S$S$S$S$S^S$$;                   \n" +
                "                   SSP   `^$S$S$^'   TSS                   \n" +
                "                   $$       `\"'       $$                   \n" +
                "                  _SS ,-           -  SS_                  \n" +
                "                 :-.|  _    - .-   _  |.-;                 \n" +
                "                 :\\(; ' \"-._.'._.-\" ` |)/;                 \n" +
                "                  \\`|  , o       o .  |'/                  \n" +
                "                   \":     -'   `-     ;\"                   \n" +
                "                     ;.              :  bug                \n" +
                "                     : `    ._.    ' ;                     \n" +
                "                   .sSb   ._____.   dSs.                   \n" +
                "                _.d8dSSb.   ._.   .SSbT8b._                \n" +
                "            _.oOPd88SSSS T.     .P SSSS888OOo.             \n" +
                "        _.mMMOOPd888SSSSb TSqqqSP dSSSS88OMOOOMm._         \n" +
                "     .oOMMMOMOOM8O8OSSSSSb TSSSP dSSSSS8OOMMOOMMOOOo._     \n" +
                "   .OOMMOOOMMOOMOOOO  \"^SSSTSSP dSSS^\"OOOOMMOOMMMOOMMMb.   \n" +
                "  dOOOMMMOMMOOOMOOOO      \"^SSSS^\"   :OOO8MMMOOMMOOMMOMMb  \n" +
                " :MMMOOMMOMMOOMMO8OS         `P      8O8OPdMMOOMMOMMOMMMM; \n" +
                " MMMMOOMMMMMOOMbTO8S;               :8888MMMMMOMMOMMOMMMMM \n" +
                " OMMMMOOMMMMOOOMMOOOS        S     :O8OPdMOMMMOMOMMOOMMMMO \n" +
                ":OMMMMOOMMOMMOOMbTObTb.     :S;   .PdOPdMOOMMMMMOMMOMMMMMO;\n" +
                "MOOMMMMOMMOMMOOMMMOObTSSg._.SSS._.PdOPdMOOMMMMOMMMMOMMMMOOM\n" +
                "MMOMMMMOMMMOMMOOMMbT8bTSSSSSSSSSPd8OPdOOOMMMMOOMMMMOMMMOOMM\n" +
                "MMOMMMOMMMMMOMMOOMMMbT8bTSSSSSPd88PdOOOOMMMMOOMMMMMMMMOOMMM");
    }
}
