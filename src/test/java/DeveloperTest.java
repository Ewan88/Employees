import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Bob", "NI446699", 30000.0);
    }

    @Test
    public void hasAName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasAnNInumber(){
        assertEquals("NI446699", developer.getNInumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(30000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5.50);
        assertEquals(30005.50, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300.0, developer.payBonus(), 0.0);
    }


}
