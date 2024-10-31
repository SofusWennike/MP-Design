package model;

import java.util.ArrayList;

/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Loan> loans;
    private static LoanContainer instance;

    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
        // initialise instance variables
        
    }

    public static LoanContainer getInstance(){
        if (instance == null) {
            instance = new LoanContainer();
        }
        
        return instance;
    }
    
    public void createLoan(String loanNumber, String borrowDate, int period, boolean state, String returnDate, Friend friend, Copy copy){
        Loan newLoan = new Loan(loanNumber, borrowDate, period, state, returnDate, friend, copy);
        
        loans.add(newLoan);
    }
}
