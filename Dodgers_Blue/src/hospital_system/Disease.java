package hospital_system;

public class Disease {

    private DiseaseDescription diseaseDescription=DiseaseDescription.values()[(int) (Math.random()*DiseaseDescription.values().length)];
    private int timeToCure=(int)(Math.random()*19)+3;

    public Disease() {}

    public DiseaseDescription getDiseaseDescription() {return diseaseDescription;}

    public void setDiseaseDescription(DiseaseDescription diseaseDescription) {this.diseaseDescription = diseaseDescription;}

    public int getTimeToCure() {return timeToCure;}

    public void setTimeToCure(int timeToCure) {this.timeToCure = timeToCure;}

    @Override
    public String toString() {
        return  "{Disease description=" + diseaseDescription +
                ", timeToCure=" + timeToCure +
                '}';
    }
}
