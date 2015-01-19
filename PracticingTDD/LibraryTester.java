

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTester
{
    Library lib;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        lib = new LibraryImpl("Birkbeck");
    }
    
    /**
     * 
     */
    @Test
    public void checkMaxBooks() {
        assertEquals(lib.setMaxBooksPerUser(6), 6);
        assertEquals(lib.getMaxBooksPerUser(), 6);
    }
    
    /**
     * 
     */
    @Test
    public void getUserId() {
        assertEquals(lib.getId("Mayer"), 1);
        assertEquals(lib.getId("Mayer"), 1);
        assertEquals(lib.getId("Miller"), 2);
        assertEquals(lib.getId("Miller"), 2);
    }
}
