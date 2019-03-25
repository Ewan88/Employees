import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Bob", "NI446699", 30000.0);
    }

    @Test
    public void hasAName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void hasAnNInumber(){
        assertEquals("NI446699", databaseAdmin.getNInumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5.50);
        assertEquals(30005.50, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300.0, databaseAdmin.payBonus(), 0.0);
    }


}
