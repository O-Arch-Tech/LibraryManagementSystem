package librarymanagementsystem;

import java.util.Date;

/**
 * A class representing a book kept in the library
 * @author Khalid Tarek
 */
public class Book {
    /**
     * A static variable representing the numbers of copies available of this book
     */
    private static int NumberOfCopiesAvailable = 0;
    
    private final long id;
    private final int copyNumber;
    private final String bookName;
    private final String authorName;
    private final Date publicationDate;

    /**
     * A basic constructor 
     */
    private Book(int NumberOfCopiesAvailable, long id, int copyNumber, 
            String bookName, String authorName, Date publicationDate){
        Book.NumberOfCopiesAvailable = NumberOfCopiesAvailable;
        this.id = id;
        this.copyNumber = copyNumber;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }
    
    /**
     * @return the NumberOfCopiesAvailable
     */
    public static int getNumberOfCopiesAvailable() {
        return NumberOfCopiesAvailable;
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

    /**
     * @param NumberOfCopiesAvailable the NumberOfCopiesAvailable to set
     */
    public static void setNumberOfCopiesAvailable(int NumberOfCopiesAvailable) {
        Book.NumberOfCopiesAvailable = NumberOfCopiesAvailable;
    }
    
    
}
