
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
    private User r;
    private Library lib;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        u = new UserImpl("Mayer");
        r = new UserImpl("Miller");
        
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
        u.setId(99);
        assertEquals(u.getId(), 99);
    }
    
    /**
     * 
     */
    @Test
    public void registerLibrary() {
        Library lib = new LibraryImpl("Birkbeck");
        u.register(lib);
        assertEquals(u.getLibrary(), lib);
        assertEquals(u.getId(), 0);
        r.register(lib);
        assertEquals(r.getLibrary(), lib);
        assertEquals(r.getId(), 1);
    }
}
