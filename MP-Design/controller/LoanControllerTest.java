package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LoanControllerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LoanControllerTest
{
    private controller.LoanController loanCont1;

    /**
     * Default constructor for test class LoanControllerTest
     */
    public LoanControllerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        loanCont1 = new controller.LoanController();
        loanCont1.createLoan("1", "1", 1, true, "1", "TestPhone1", "TestSerialNumber2-2");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
