package tui;
import java.util.Scanner;


/**
 * Write a description of class MainMenuUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMenuUI
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MainMenuUI
     */
    public MainMenuUI(){
    
        // initialise instance variables
        x = 0;
    }

    public void start() {
       
        mainMenu();
    }
    
    private void mainMenu() {
       boolean exit = false;
       while(!exit) {
          int choice = writeMainMenu(); 
          if(choice == 1) { //create the customer
            
          }
          else if (choice == 2) { //find the customer
            
          } 
          else {
            exit = true;
            System.out.println("Fortsat god dag.");
          }//end else  
       }//end while
    }
    
    private int writeMainMenu() {
        // makes an object keyboard to read input from the screen
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Kundemenu ***");
        System.out.println(" (1) Opret kunde");
        System.out.println(" (2) Fremsøg kunde");
        System.out.println(" (3) Afslut");
        System.out.print("\n Indtast et tal: ");
        while (!keyboard.hasNextInt()) {         
            System.out.println("Du skal indtaste et tal - prøv igen.");
            keyboard.nextLine();
            
        }

        choice = keyboard.nextInt();
        return choice;
    }
}
