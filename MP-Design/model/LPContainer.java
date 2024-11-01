package model;
import java.util.ArrayList;


/**
 * Write a description of class LPContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private static LPContainer instance;
    private ArrayList<LP> lpList;

    /**
     * Constructor for objects of class LPContainer
     */
    private LPContainer(){
        lpList = new ArrayList<>();
        
    }

    public static LPContainer getInstance(){
        if (instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public Copy findLPCopy(String serialNumber){
        for (LP lp : lpList) {
            if (lp.findCopy(serialNumber) != null) {
                return lp.findCopy(serialNumber);
            }
        }
        return null;
    }
    
    public void testData(){
        LP testLP1 = createLP("TestBarcode1", "TestTitle1", "TestArtist1", "TestPublicationDate1");
        testLP1.createCopy("TestSerialNumber1-1", "TestPurchaseDate1-1", 153.99, true);
        testLP1.createCopy("TestSerialNumber1-2", "TestPurchaseDate1-2", 79.75, true);
        testLP1.createCopy("TestSerialNumber1-3", "TestPurchaseDate1-3", 164.00, true);
        testLP1.createCopy("TestSerialNumber1-4", "TestPurchaseDate1-4", 1003.10, true);
        
        LP testLP2 = createLP("TestBarcode2", "TestTitle2", "TestArtist2", "TestPublicationDate2");
        testLP2.createCopy("TestSerialNumber2-1", "TestPurchaseDate2-1", 153.99, true);
        testLP2.createCopy("TestSerialNumber2-2", "TestPurchaseDate2-2", 79.75, true);
        testLP2.createCopy("TestSerialNumber2-3", "TestPurchaseDate2-3", 164.00, true);
        testLP2.createCopy("TestSerialNumber2-4", "TestPurchaseDate2-4", 1003.10, true);
        
        LP testLP3 = createLP("TestBarcode3", "TestTitle3", "TestArtist3", "TestPublicationDate3");
        testLP3.createCopy("TestSerialNumber3-1", "TestPurchaseDate3-1", 153.99, true);
        testLP3.createCopy("TestSerialNumber3-2", "TestPurchaseDate3-2", 79.75, true);
        testLP3.createCopy("TestSerialNumber3-3", "TestPurchaseDate3-3", 164.00, true);
        testLP3.createCopy("TestSerialNumber3-4", "TestPurchaseDate3-4", 1003.10, true);
    }
    
    public LP createLP(String barcode, String title, String artist, String publicationDate){
        LP lp = new LP(barcode, title, artist, publicationDate);
        addLP(lp);
        return lp;
    }
    
    public void addLP(LP lp){
        lpList.add(lp);
    }
}
