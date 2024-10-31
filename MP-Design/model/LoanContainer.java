package model;

import java.util.ArrayList;

/**
 * Write a description of class LoanContainer here.
 * Container-klasse der håndterer alle lån i systemet
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    
    private ArrayList<Loan> loans;
    private static LoanContainer instance;

    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
        // initialise instance variables
        
    }

    // Returnerer den eneste instans af LoanContainer
    public static LoanContainer getInstance(){
        if (instance == null) {
            instance = new LoanContainer();
        }
        
        return instance;
    }
    
    // Opretter nyt lån og tilføjer det til samlingen
    public void createLoan(String loanNumber, String borrowDate, int period, boolean state, String returnDate, Friend friend, Copy copy){
        Loan newLoan = new Loan(loanNumber, borrowDate, period, state, returnDate, friend, copy);
        
        loans.add(newLoan);
    }
}
