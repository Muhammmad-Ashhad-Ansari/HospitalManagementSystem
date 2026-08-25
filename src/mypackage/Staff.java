package mypackage;

public class Staff extends Person {
    String role;

    public Staff(String name, int id, String gender, String role) {
        super(name, id, gender);
        this.role = role;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}
