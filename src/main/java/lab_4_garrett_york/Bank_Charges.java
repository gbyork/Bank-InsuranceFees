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
public class Bank_Charges {
     public static void main(String[] args) 
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of checks for the month");
    int AmountofChecks = keyboard.nextInt();
    
     double CostofChecks = Bankfees(AmountofChecks); 
    
    System.out.println("Service fees: $" + CostofChecks);
  }
    
  public static double Bankfees (int checks)
  {
  double baseFee = 10;
  double finalCharge = 0;
  double checkFee = 0;
  if (checks < 20) 
  {
   checkFee = 0.10;
  } else if (checks >= 20 && checks <40)
  {
   checkFee = 0.08;
  } else if (checks >= 40 && checks < 60)
  {
   checkFee = 0.06;
  } else {
   checkFee = 0.04;
  }
  finalCharge = baseFee + (checkFee * checks);
  return finalCharge;
  }          
    
}
