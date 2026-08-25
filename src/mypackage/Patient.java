package mypackage;

public class Patient extends Person {
    String ailment;

    public Patient(String name, int id, String gender, String ailment) {
        super(name, id, gender);
        this.ailment = ailment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ailment: " + ailment);
    }
}
