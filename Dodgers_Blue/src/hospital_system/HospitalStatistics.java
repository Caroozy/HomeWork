package hospital_system;

public class HospitalStatistics {
    public static int totalPeople(Hospital hospital){
        int total=0;
        for (int i=0;i<hospital.getRooms().length;i++){
            if (hospital.getRooms()[i].getDoctor().getName()!=null){
                total++;
            }
            if (hospital.getRooms()[i].getNurse().getName()!=null){
                total++;
            }
            for (int id=0;id<hospital.getRooms()[i].getPatients().length;id++){
                if (hospital.getRooms()[i].getPatients()[id].getName()!=null){
                    total++;
                }
            }
        }
        return total;
    }

    public static double avgTimeToCure(Hospital hospital){
        if (hospital.getRooms().length==0){
            return 0;
        }
        int total=0;
        int count=0;
        for (int i=0;i<hospital.getRooms().length;i++){
            if (hospital.getRooms()[i].getPatients().length==0){
                return 0;
            }
            for (int id=0;id<hospital.getRooms()[i].getPatients().length;id++){
                total+=hospital.getRooms()[i].getPatients()[id].getDisease().getTimeToCure();
                count++;
            }
        }
        return total/count;
    }

    public static double avgTimeToCurePerDisease(Hospital hospital, DiseaseDescription diseaseDescription){
        int total=0;
        int count=0;

        for (int i=0;i<hospital.getRooms().length;i++){
            for (int id=0;id<hospital.getRooms()[i].getPatients().length;id++){
                if (hospital.getRooms()[i].getPatients()[id].getDisease().getDiseaseDescription().getValue()==diseaseDescription.getValue());
                count++;
                total+=hospital.getRooms()[i].getPatients()[id].getDisease().getTimeToCure();
            }
        }
        if (count==0){
            return 0;
        }
        return total/count;
    }
}
