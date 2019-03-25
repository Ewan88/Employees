import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Wendy", "NI247896", 40000.0, "Testing", 1000000.0);
    }

    @Test
    public void hasABudget(){
        assertEquals(1000000.0, director.getBudget(), 0.0);
    }

    @Test
    public void canGet2PercentBonus(){
        assertEquals(800.0, director.payBonus(), 0.0);
    }

}
