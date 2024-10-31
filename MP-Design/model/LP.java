package model;
import java.util.ArrayList;


/**
 * Write a description of class LP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LP
{
    // instance variables - replace the example below with your own
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copyList;

    /**
     * Constructor for objects of class LP
     */
    public LP(String barcode, String title, String artist, String publicationDate){
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copyList = new ArrayList<>();
    }
    
    public Copy findCopy(String serialNumber){
        String match = "";
        for (Copy copy : copyList) {
            match = copy.getSerialNumber();
            
                if (match.equals(serialNumber)) {
                     return copy;
                }
        
        }
        return null;
    }

    public Copy createCopy(String serialNumber, String purchaseDate, double purchasePrice, boolean isAvailable){
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice, isAvailable);
        addCopy(copy);
        return copy;
    }
    
    public void addCopy(Copy copy){
        copyList.add(copy);
    }
}
