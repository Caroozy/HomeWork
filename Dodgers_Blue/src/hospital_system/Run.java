package hospital_system;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Hospital hospital=new Hospital();
        hospital.setName("Shiva");
        for (int i=0;i<hospital.getRooms().length;i++){
            hospital.getRooms()[i]=new Room();
            hospital.getRooms()[i].setRoomNumber(i+1);
            Doctor doctor=new Doctor();
            doctor.setRoomNumber(i+1);
            hospital.getRooms()[i].setDoctor(doctor);
            Nurse nurse=new Nurse();
            nurse.setRoomNumber(i+1);
            hospital.getRooms()[i].setNurse(nurse);

            for (int id=0;id<hospital.getRooms()[i].getPatients().length;id++){
                hospital.getRooms()[i].getPatients()[id]=new Patient();
            }
        }
        print(hospital);
    }
    public static void print(Hospital hospital){
        System.out.println("----"+hospital.getName()+"----");
        for (int i=0;i<hospital.getRooms().length;i++){
            System.out.println("Room number."+hospital.getRooms()[i].getRoomNumber());
            System.out.println(hospital.getRooms()[i].getDoctor().toString());
            System.out.println(hospital.getRooms()[i].getNurse().toString());
            System.out.println("Are responsible for the patients:");
            System.out.println("-------------------------------------------");
            for (int id=0;id<hospital.getRooms()[i].getPatients().length;id++){
                System.out.println(hospital.getRooms()[i].getPatients()[id].toString());
            }
            System.out.println("-------------------------Next Room-------------------------");
        }
    }
}
