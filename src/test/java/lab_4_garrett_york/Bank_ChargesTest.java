
package lab_4_garrett_york;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Garrett York
 */
public class Bank_ChargesTest {
    
  
   

    @Test
    public void testBankfees() {
        System.out.println("Bankfees");
        int checks = 15;
        double expResult = 11.5;
        double result = Bank_Charges.Bankfees(checks);
        assertEquals(expResult, result, 0.0);
        
    }
   
      public void testBankfees1() {
        System.out.println("Bankfees");
        int checks = 25;
        double expResult = 12;
        double result = Bank_Charges.Bankfees(checks);
        assertEquals(expResult, result, 0.0);
        
    }
    public void testBankfees2() {
        System.out.println("Bankfees");
        int checks = 45;
        double expResult = 12.7;
        double result = Bank_Charges.Bankfees(checks);
        assertEquals(expResult, result, 0.0);
        
    }
    
    public void testBankfees3() {
        System.out.println("Bankfees");
        int checks = 70;
        double expResult = 12.8;
        double result = Bank_Charges.Bankfees(checks);
        assertEquals(expResult, result, 0.0);
        
    }
}
