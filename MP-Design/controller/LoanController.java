package controller;

import model.*;
import java.util.ArrayList;

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
    
    public Loan findLoanByLoanNumber(String loanNumber){
        return LoanContainer.getInstance().findLoanByLoanNumber(loanNumber);
    }
    
    public FriendController getFriendController() {
        return this.friendController;
    }
    
    public LPController getLPController(){
        return this.lpController;
    }
    
    public ArrayList<Loan> findLoansByFriend(Friend friend) {
        return LoanContainer.getInstance().findLoansByFriend(friend);
    }
}
