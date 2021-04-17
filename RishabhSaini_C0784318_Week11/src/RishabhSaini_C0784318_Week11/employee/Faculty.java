package RishabhSaini_C0784318_Week11.employee;

import RishabhSaini_C0784318_Week11.Gender;
import RishabhSaini_C0784318_Week11.vehicle.Vehicle;

public class Faculty extends Employee {
    String department;

    public Faculty(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, first_name, last_name, gender, vehicle, totalSalary);
        department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }
}
