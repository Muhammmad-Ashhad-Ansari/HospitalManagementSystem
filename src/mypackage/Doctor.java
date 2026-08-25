package mypackage;

public class Doctor extends Person {
    String specialization;

    public Doctor(String name, int id, String gender, String specialization) {
        super(name, id, gender);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
