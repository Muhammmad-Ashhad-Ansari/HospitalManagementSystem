# Hospital Management System 🏥💼

A comprehensive, Object-Oriented Java console application designed to streamline healthcare workflows, maintain user registers, and efficiently manage hospital resources.

## 🚀 Key Architectural Features

This application model simulates real-world healthcare entities using fundamental OOP pillars (Inheritance, Encapsulation, Polymorphism):

* **`Person` (Base Class):** Maps common attributes shared by any individual within the workspace.
* **`Patient`:** Tracks check-in metrics, dynamic history logs, and operational data.
* **`Doctor`:** Handles professional metadata, medical specialties, and shifts.
* **`Staff`:** Oversees support personnel details and logistical tasks.
* **`Ward`:** Controls room allocations, bed availability, and patient placement.
* **`Hospital`:** Acts as the central structural hub coordinating administrative records across branches.

## 🛠️ Project Directory Layout

The workspace mirrors standard compilation and metadata environments:

```text
HospitalManagementSystem/
├── src/
│   └── mypackage/              # Source code directory
│       ├── Person.java         # Base entity blueprint
│       ├── Patient.java        # Patient file structure
│       ├── Doctor.java         # Doctor records model
│       ├── Staff.java          # Administrative worker class
│       ├── Ward.java           # Room assignment logic
│       ├── Hospital.java       # Central system coordinator
│       └── HospitalManagementSystem.java  # Main runtime configuration
└── bin/                        # Compiled target bytecode class layers
```

## 📦 System Requirements

* **Java Development Kit (JDK):** Version 8 or higher.
* **IDE Setup:** Eclipse (contains active workspace `.metadata` preferences) or VS Code.

## 🚀 Setup & Execution

### Option A: VS Code Terminal Run
To compile and execute manually via the integrated console window, enter:

```bash
# Compile package modules
javac -d bin src/mypackage/*.java

# Boot main orchestrator
java -cp bin mypackage.HospitalManagementSystem
```

### Option B: Eclipse IDE Setup
1. Open Eclipse and choose the project directory as your workspace.
2. Click **File > Import > Existing Projects into Workspace**.
3. Select `HospitalManagementSystem` and run `HospitalManagementSystem.java` as a **Java Application**.

## 📄 License
This management portal tool is open-source under the **MIT License**.
