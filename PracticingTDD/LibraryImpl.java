
/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibraryImpl implements Library
{
    private String name;
    private int maxBooksAtOnce;
    
    /**
     * 
     */
    public LibraryImpl(String name) {
        this.name = name;
    }
    
    /**
     * 
     */
    public int setMaxBooksPerUser(int max) {
        return maxBooksAtOnce = max;
    }
    
    /**
     * 
     */
    public int getMaxBooksPerUser() {
        return maxBooksAtOnce;
    }
}
