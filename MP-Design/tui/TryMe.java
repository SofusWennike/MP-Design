package tui;

import model.*;

import controller.*;
import java.util.ArrayList;


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
        loanController.createLoan("2", "1", 1, true, "1", "TestPhone1", "TestSerialNumber2-1");
        loanController.createLoan("3", "1", 1, true, "1", "TestPhone1", "TestSerialNumber1-1");
    }
    
    public Loan findLoan(String loanNumber) {
        return loanController.findLoanByLoanNumber(loanNumber);
    }
    
    public Friend findFriend(String phone){
        return loanController.getFriendController().findFriend(phone);
    }
    
    public void removeFriendByPhone(String phone) {
        loanController.getFriendController().removeFriendByPhone(phone);
    }
    
    public ArrayList<Loan> findLoansByFriend(String phone) {
        ArrayList<Loan> friendLoans = new ArrayList<>();
        friendLoans = loanController.findLoansByFriend(findFriend(phone));
        
        for (Loan loan : friendLoans) {
            System.out.print(loan.getFriend().getPhone() + ", " + loan.getCopy().getSerialNumber());
        }
        
        return friendLoans;
    }
}
