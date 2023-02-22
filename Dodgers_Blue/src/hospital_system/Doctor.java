package hospital_system;

public class Doctor extends Person{

    DiseaseDescription diseaseSpeciality=DiseaseDescription.values()[(int) (Math.random()*DiseaseDescription.values().length)];

    private int roomNumber;

    public Doctor() {}

    public DiseaseDescription getDiseaseSpeciality() {return diseaseSpeciality;}

    public void setDiseaseSpeciality(DiseaseDescription diseaseSpeciality) {this.diseaseSpeciality = diseaseSpeciality;}

    public int getRoomNumber() {return roomNumber;}

    public void setRoomNumber(int roomNumber) {this.roomNumber = roomNumber;}

    @Override
    public String toString() {
        return "ID: "+super.getId()+" Name: Doctor"+super.getId()+" Age: "+super.getAge()+" Specialist to: "+getDiseaseSpeciality()+" Belongs to room nm."+roomNumber;
    }
}
