import java.util.*;

/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LibraryImpl implements Library
{
    private final String name;
    private int maxBooksAtOnce;
    private List<User> users;
    private List<Book> books;

    /**
     * 
     */
    public LibraryImpl(String name) {
        this.name = name;
        this.users = new ArrayList<User>();
    }

    /**
     * 
     */
    public String getName() {
        return name;
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
        boolean found = false;
        int i = 0;  
        while (i < users.size() && !found) {
            if (users.get(i).getName().equals(personName)) {
                found = true;
            } else {
                i++;
            }
        }
        if (!found) {
            users.add(new UserImpl(personName));
        }
        return i;
    }

    public void addBook(String title, String author) {

    }
}