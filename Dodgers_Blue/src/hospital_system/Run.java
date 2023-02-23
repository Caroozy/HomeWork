package hospital_system;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.setName("Shiva");
        for (int i = 0; i < hospital.getRooms().length; i++) {
            hospital.getRooms()[i] = new Room();
            hospital.getRooms()[i].setRoomNumber(i + 1);
            Doctor doctor = new Doctor();
            doctor.setRoomNumber(i + 1);
            hospital.getRooms()[i].setDoctor(doctor);
            Nurse nurse = new Nurse();
            nurse.setRoomNumber(i + 1);
            hospital.getRooms()[i].setNurse(nurse);

            for (int id = 0; id < hospital.getRooms()[i].getPatients().length; id++) {
                hospital.getRooms()[i].getPatients()[id] = new Patient();
            }
        }
        print(hospital);
        System.out.println("Average age: " + avgAge(hospital));
        System.out.println("The most common disease is: " + commonDisease(hospital));
        System.out.println("The rarest disease is: "+rareDisease(hospital));
        System.out.println("The average age of the doctors and nurses is: "+avgNurseDoctorAge(hospital));
    }

    public static void print(Hospital hospital) {
        System.out.println("----" + hospital.getName() + "----");
        for (int i = 0; i < hospital.getRooms().length; i++) {
            System.out.println("Room number." + hospital.getRooms()[i].getRoomNumber());
            System.out.println(hospital.getRooms()[i].getDoctor().toString());
            System.out.println(hospital.getRooms()[i].getNurse().toString());
            System.out.println("Are responsible for the patients:");
            System.out.println("-------------------------------------------");
            for (int id = 0; id < hospital.getRooms()[i].getPatients().length; id++) {
                System.out.println(hospital.getRooms()[i].getPatients()[id].toString());
            }
            System.out.println("-------------------------Next Room-------------------------");
        }
    }

    public static double avgAge(Hospital hospital) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < hospital.getRooms().length; i++) {
            if (hospital.getRooms()[i].getNurse().getName() != null) {
                total += hospital.getRooms()[i].getNurse().getAge();
                count++;
            }
            if (hospital.getRooms()[i].getDoctor().getName() != null) {
                total += hospital.getRooms()[i].getDoctor().getAge();
                count++;
            }
            for (int id = 0; id < hospital.getRooms()[i].getPatients().length; id++) {
                if (hospital.getRooms()[i].getPatients()[id].getName() != null) {
                    total += hospital.getRooms()[i].getPatients()[id].getAge();
                    count++;
                }
            }
        }
        return total / count;
    }

    public static String commonDisease(Hospital hospital) {
        int tuberculosis = 0;
        int pneumonia = 0;
        int covid19 = 0;
        int fracture = 0;
        int cardio = 0;
        int top = Integer.MIN_VALUE;
        String topDisease = null;
        for (int i = 0; i < hospital.getRooms().length; i++) {
            for (int id = 0; id < hospital.getRooms()[i].getPatients().length; id++) {
                switch (hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()) {
                    case 0:
                        tuberculosis++;
                        if (tuberculosis > top) {
                            top = tuberculosis;
                            topDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 1:
                        pneumonia++;
                        if (pneumonia > top) {
                            top = pneumonia;
                            topDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 2:
                        covid19++;
                        if (covid19 > top) {
                            top = covid19;
                            topDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 3:
                        fracture++;
                        if (fracture > top) {
                            top = fracture;
                            topDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 4:
                        cardio++;
                        if (cardio > top) {
                            top = cardio;
                            topDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                }
            }
        }
        return topDisease;
    }
    public static String rareDisease(Hospital hospital) {
        int tuberculosis = 0;
        int pneumonia = 0;
        int covid19 = 0;
        int fracture = 0;
        int cardio = 0;
        int bottom = Integer.MAX_VALUE;
        String bottomDisease = null;
        for (int i = 0; i < hospital.getRooms().length; i++) {
            for (int id = 0; id < hospital.getRooms()[i].getPatients().length; id++) {
                switch (hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()) {
                    case 0:
                        tuberculosis++;
                        if (tuberculosis < bottom) {
                            bottom = tuberculosis;
                            bottomDisease =DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 1:
                        pneumonia++;
                        if (pneumonia < bottom) {
                            bottom = pneumonia;
                            bottomDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 2:
                        covid19++;
                        if (covid19 < bottom) {
                            bottom = covid19;
                            bottomDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 3:
                        fracture++;
                        if (fracture < bottom) {
                            bottom = fracture;
                            bottomDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                        break;
                    case 4:
                        cardio++;
                        if (cardio < bottom) {
                            bottom = cardio;
                            bottomDisease = DiseaseDescription.values()[hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()].name();
                        }
                }
            }
        }
        return bottomDisease;
    }

    public static double avgNurseDoctorAge(Hospital hospital){
        int total=0;
        for (int i=0;i<hospital.getRooms().length;i++){
            total+=hospital.getRooms()[i].getDoctor().getAge()+hospital.getRooms()[i].getNurse().getAge();
        }
        return total/(hospital.getRooms().length*2);
    }


}
