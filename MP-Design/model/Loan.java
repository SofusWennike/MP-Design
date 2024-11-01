package model;


/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private String loanNumber, borrowDate, returnDate;
    private int period;
    private boolean state;
    private Friend friend;
    private Copy copy;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(String loanNumber, String borrowDate, int period, boolean state, String returnDate, Friend friend, Copy copy)
    {
        // initialise instance variables
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.period = period;
        this.state = state;
        this.returnDate = returnDate;
        this.friend = friend;
        this.copy = copy;
    }

    public String getLoanNumber(){
        return this.loanNumber;
    }
    
    public String getBorrowDate() {
        return this.borrowDate;
    }
    
    public int period() {
        return this.period;
    }
    
    public boolean state() {
        return this.state;
    }
    
    public String getReturnDate(){
        return this.returnDate;
    }
    
    public Friend getFriend(){
        return this.friend;
    }
    
    public Copy getCopy(){
        return this.copy;
    }
}
