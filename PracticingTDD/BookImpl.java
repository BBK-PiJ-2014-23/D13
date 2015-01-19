
/**
 * Write a description of interface Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BookImpl implements Book
{
    final String author;
    final String title;
    
    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }
    
    /**
     * 
     */
    public String getAuthor() {
        return "fail";
    }
    
    /**
     * 
     */
    public String getTitle() {
        return "fail";
    }
}
