package librarymanagementsystem;

import java.util.Date;

/**
 * A class representing a book kept in the library
 * @author Khalid Tarek
 */
public class Book {
   
    private final long id;
    private final int copyNumber;
    private final String bookName;
    private final String authorName;
    private final Date publicationDate;

    /**
     * A basic constructor 
     */
    public Book(long id, int copyNumber, String bookName, 
            String authorName, Date publicationDate){
        this.id = id;
        this.copyNumber = copyNumber;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the copyNumber
     */
    public int getCopyNumber() {
        return copyNumber;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @return the publicationDate
     */
    public Date getPublicationDate() {
        return publicationDate;
    }
    
    @Override
    public String toString(){
        StringBuilder bookString = new StringBuilder("");
        
        bookString.append("Unique ID: ").append(id).append(copyNumber).append("\n");
        bookString.append(bookName).append("\n");
        bookString.append("by: ").append(authorName).append("\n");
        bookString.append(publicationDate.toString());
        
        return bookString.toString();
    }
    
}
