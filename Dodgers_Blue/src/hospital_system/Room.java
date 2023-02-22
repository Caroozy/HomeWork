package hospital_system;

import java.util.Arrays;

public class Room {
    private int roomNumber;

    private Doctor doctor;

    private Nurse nurse;

    private Patient[]patients=new Patient[5];

    public Room() {}

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", doctor=" + doctor.toString() +
                ", nurse=" + nurse.toString() +
                ", patients=" + Arrays.toString(patients) +
                '}';
    }
}
