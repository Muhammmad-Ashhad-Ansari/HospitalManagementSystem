package mypackage;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        hospital.addDoctor(new Doctor("Dr. Smith", 45, "Male", "Cardiology"));
        hospital.addDoctor(new Doctor("Dr. Alice", 38, "Female", "Neurology"));

        hospital.addPatient(new Patient("John Doe", 30, "Male", "Flu"));
        hospital.addPatient(new Patient("Jane Roe", 28, "Female", "Fracture"));

        hospital.addStaff(new Staff("Mr. Brown", 50, "Male", "Receptionist"));
        hospital.addStaff(new Staff("Ms. Green", 35, "Female", "Nurse"));

        hospital.addWard(new Ward("General Ward", 20));
        hospital.addWard(new Ward("ICU", 5));

        hospital.displayHospitalDetails();
    }
}
