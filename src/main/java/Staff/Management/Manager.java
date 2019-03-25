package Staff.Management;

import Staff.Employee;
import Staff.TechStaff.Developer;

public class Manager extends Employee {

    Manager manager;
    String department;

    public Manager(String name, String NInumber, double salary, String department){
        super(name, NInumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }


    public void changeName(Developer employee, String newName) {
        if (newName.length() > 0){
            employee.setName(newName);
        }
    }
}
