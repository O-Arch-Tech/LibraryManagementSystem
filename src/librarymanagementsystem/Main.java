package librarymanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khalid Tarek
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Date harryPotterDate = null;
        try {
            harryPotterDate = new SimpleDateFormat("yyyy-MM-dd").parse("1997-06-26");
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Book harryPotter1 = new Book(111000, 2, 
                "Harry Potter and the Sorcerer's Stone", 
                "J.K. Rowling", harryPotterDate);
        
        System.out.println(harryPotter1);
    }
    
}
