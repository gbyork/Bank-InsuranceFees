/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4_garrett_york;

import java.util.Scanner;

/**
 *
 * @author Garrett York
 */
public class Insurance_estimator {
    public static void main(String[] args) 
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your age to calculate life insurance.");
    double age = keyboard.nextDouble();
    
    double insurance = calculateLifeInsurance(age); 
    
    System.out.println("Your life insurance cost is per year is $" + insurance + "/year");
  }
    
  public static double calculateLifeInsurance(double number)
  {
  if (number< 0)
  {
  return 0;
  }
  double insurancecost = number*5+300;
  return insurancecost;
  }          
    
}
