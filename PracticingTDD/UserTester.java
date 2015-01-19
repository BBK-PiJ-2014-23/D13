

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
    User u;
    
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
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * 
     */
    @Test
    public void getNameAndPlaceholderID() {
        assertEquals(u.getName(), "Mayer");
        assertEquals(u.getId(), 0);
    }
    
    /**
     * 
     */
    @Test
    public void setID() {
        assertEquals(u.setId(99), 99);
    }
    
    /**
     * 
     */
    @Test
    public void getRealID() {
        assertEquals(u.getId(), 99);
    }
}
