
package lab_4_garrett_york;


import static org.junit.jupiter.api.Assertions.*;


public class Insurance_estimatorTest {
    
  
    public void testCalculateLifeInsurance() {
        System.out.println("calculateLifeInsurance");
        double number = 33;
        double expResult = 465;
        double result = Insurance_estimator.calculateLifeInsurance(number);
        assertEquals(expResult, result, 0.0);
       
    }
    public void testCalculateLifeInsurance1() {
        System.out.println("calculateLifeInsurance");
        double number = -1;
        double expResult = 0;
        double result = Insurance_estimator.calculateLifeInsurance(number);
        assertEquals(expResult, result, 0.0);
       
    }
}
