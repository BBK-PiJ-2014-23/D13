
/**
 * Write a description of class UserImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserImpl implements User
{
    String name;
    int id;
    
    /**
     * 
     */
    public UserImpl(String name){
        this.name = name;
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
    public int setId(int id) {
        return this.id = id;
    }
    
    /**
     * 
     */
    public int getId() {
        return id;
    }
}
