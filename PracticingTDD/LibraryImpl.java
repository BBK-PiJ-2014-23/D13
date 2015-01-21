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
    private List<String> users;

    /**
     * 
     */
    public LibraryImpl(String name) {
        this.name = name;
        this.users = new ArrayList<String>();
    }

    /**
     * 
     */
    public void setMaxBooksPerUser(int max) {
        maxBooksAtOnce = max;
    }

    /**
     * 
     */
    public int getMaxBooksPerUser() {
        return maxBooksAtOnce;
    }

    public int getId(String personName) {
        if (users.contains(personName)) {
            return users.indexOf(personName);
        } else {
            users.add(personName);
            return users.indexOf(personName);
        }
    }
}