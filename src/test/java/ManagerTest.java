import Staff.Employee;
import Staff.Management.Manager;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Alice", "NI299754", 35000, "Testing");
    }

    @Test
    public void hasADepartment(){
        assertEquals("Testing", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(35.50);
        assertEquals(35035.50, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(350.0, manager.payBonus(), 0.0);
    }

    @Test
    public void canChangeEmployeeName() {
        Developer employee = new Developer("Henry", "test", 0);
        manager.changeName(employee, "Dave");
        assertEquals("Dave", employee.getName());
    }

    @Test
    public void cannotChangeEmpeeNameIfNull(){
        Developer employee = new Developer("Henry", "test", 0);
        manager.changeName(employee, "");
        assertEquals("Henry", employee.getName());
    }

}
