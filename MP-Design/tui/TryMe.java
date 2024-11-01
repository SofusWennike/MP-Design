package tui;

import model.*;

import controller.*;


/**
 * Write a description of class TryMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TryMe
{
    // instance variables - replace the example below with your own
    LoanController loanController;

    /**
     * Constructor for objects of class TryMe
     */
    public TryMe()
    {
        // initialise instance variables
        loanController = new LoanController();
        testLpData();
        testFriendData();
    }

    public void testLpData() {
        LPContainer.getInstance().testData();
    }
    
    public void testFriendData() {
        FriendContainer.getInstance().testData();
    }
    
    public void createLoan(){
        loanController.createLoan("1", "1", 1, true, "1", "TestPhone1", "TestSerialNumber2-2");
    }
    
    
}
