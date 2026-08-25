package mypackage;

import java.util.ArrayList;

public class Hospital {
    String hospitalName;
    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;
    ArrayList<Staff> staff;
    ArrayList<Ward> wards;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);

        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            doctor.displayInfo();
            System.out.println();
        }

        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            patient.displayInfo();
            System.out.println();
        }

        System.out.println("\nStaff:");
        for (Staff staffMember : staff) {
            staffMember.displayInfo();
            System.out.println();
        }

        System.out.println("\nWards:");
        for (Ward ward : wards) {
            ward.displayInfo();
            System.out.println();
        }
    }
}
