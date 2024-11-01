package controller;

import model.*;

/**
 * Controller-klasse der koordinerer oprettelse af lån
 * mellem venner og LP'er
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    // instance variables 
    private FriendController friendController;
    private LPController lpController;    

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        // initialise instance variables
        this.friendController = new FriendController();
        this.lpController = new LPController();
    }

    // Opretter lån ved at finde ven og kopi via deres controllere
    public void createLoan(String loanNumber, String borrowDate, int period, boolean state, String returnDate, String phone, String serialNumber){
        Friend friend = this.friendController.findFriend(phone);
        Copy copy = this.lpController.findCopy(serialNumber);
        
        LoanContainer.getInstance().createLoan(loanNumber, borrowDate, period, state, returnDate, friend, copy);
    
    }
}
