import java.util.*;

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
    private Map<Integer, String> users;
    private int lastUserId;
    
    /**
     * 
     */
    public LibraryImpl(String name) {
        this.name = name;
        this.users = new HashMap<Integer, String>();
        this.lastUserId = 0;
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
    
    public int getId(String personName) {
        if (users.containsValue(personName)) {
            return users.get(personName);
        } else {
            user.put(lastUserId + 1, personName);
            return users.get(personName);
        }
    }
}
