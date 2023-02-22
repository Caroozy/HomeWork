package hospital_system;

public class Patient extends Person{
    Disease disease=new Disease();

    public Patient() {}

    public Disease getDisease() {return disease;}

    public void setDisease(Disease disease) {this.disease = disease;}

    @Override
    public String toString() {
        return "ID: "+super.getId()+", Name: Patient"+super.getId()+" Age: "+super.getAge()+" "+getDisease().toString();
    }
}
