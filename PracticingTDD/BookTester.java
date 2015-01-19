
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTester.
 *
 * @author  Stefan E. Mayer
 * @version 1.0
 */
public class BookTester
{
    Book b;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        b = new BookImpl("Mayer", "Java Rocks");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        b = null;
    }

    /**
     * 
     */
    @Test
    public void getAuthorTitle() {
        assertEquals(b.getAuthor(), "Mayer");
        assertEquals(b.getTitle(), "Java Rocks");
    }
}
