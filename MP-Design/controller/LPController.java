package controller;
import model.Copy;
import model.LPContainer;
import model.LP;

/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController
{
    // instance variables - replace the example below with your own
    LPContainer lpContainer;
    
    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        // initialise instance variables
        this.lpContainer = LPContainer.getInstance();
    }
    
    public Copy findCopy(String serialNumber){
        return lpContainer.findLPCopy(serialNumber);
    }
    
    public void createTestData(){
        lpContainer.testData();
    }


}
