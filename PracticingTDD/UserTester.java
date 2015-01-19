
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserTester
{
    private User u;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        u = new UserImpl("Mayer");
    }

    /**
     * 
     */
    @Test
    public void checkName() {
        assertEquals(u.getName(), "Mayer");
    }

    /**
     * 
     */
    @Test
    public void checkID() {
        assertEquals(u.getId(), 0);
        assertEquals(u.setId(99), 99);
        assertEquals(u.getId(), 99);
    }
}
