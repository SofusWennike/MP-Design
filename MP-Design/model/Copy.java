package model;


/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy
{
    // instance variables - replace the example below with your own
    private String serialNumber;
    private String purchaseDate;
    private double purchasePrice;
    private boolean isAvailable;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(String serialNumber, String purchaseDate, double purchasePrice, boolean isAvailable){
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.isAvailable = isAvailable;
    }

    public String getSerialNumber(){
        return this.serialNumber;
    }
    
    public String getPurchaseDate() {
        return this.purchaseDate;
    }
    
    public double getPurchasePrice() {
        return this.purchasePrice;
    }
    
    public boolean isAvailable() {
        return this.isAvailable;
    }
}
