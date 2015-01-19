
/**
 * Implementation of interface book containing author and title.
 * 
 * @author Stefan E. Mayer
 * @version 1.0
 */
public class BookImpl implements Book
{
    final String author;
    final String title;
    
    /**
     * Constructor for a book object.
     */
    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }
    
    /**
     * Returns the book's author.
     * @return the author's name
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Returns the book's title.
     * @return the book's title
     */
    public String getTitle() {
        return title;
    }
}
