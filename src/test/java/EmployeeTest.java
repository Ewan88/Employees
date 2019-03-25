//import Staff.Employee;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class EmployeeTest {
//
//    Employee employee;
//
//    @Before
//    public void setup(){
//        employee = new Employee("Bob", "NI446699", 30000.0);
//    }
//
//    @Test
//    public void hasAName(){
//        assertEquals("Bob", employee.getName());
//    }
//
//    @Test
//    public void hasAnNInumber(){
//        assertEquals("NI446699", employee.getNInumber());
//    }
//
//    @Test
//    public void hasASalary(){
//        assertEquals(30000, employee.getSalary(), 0.0);
//    }
//
//    @Test
//    public void canRaiseSalary(){
//        employee.raiseSalary(5.50);
//        assertEquals(30005.50, employee.getSalary(), 0.0);
//    }
//
//    @Test
//    public void canGetPayBonus(){
//        assertEquals(300.0, employee.payBonus(), 0.0);
//    }
//}
