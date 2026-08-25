package mypackage;

public class Ward {
    String wardName;
    int capacity;
    int currentOccupancy;

    public Ward(String wardName, int capacity) {
        this.wardName = wardName;
        this.capacity = capacity;
        this.currentOccupancy = 0;
    }

    public boolean addPatient() {
        if (currentOccupancy < capacity) {
            currentOccupancy++;
            return true;
        } else {
            System.out.println("Ward is full!");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Ward Name: " + wardName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Occupancy: " + currentOccupancy);
    }
}
