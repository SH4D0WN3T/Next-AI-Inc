/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.walker.nextaiinc;

/**
 *
 * @author W4LK3R
 */
public class NextAIInc {

    // Method to calculate the total weekly pay
    public static void calculateWeeklyPay(double basePay, int hoursWorked) {
                       
        
        double regularHours = Math.min(hoursWorked, 48);  
        
        double overtimeHours = Math.max(0, hoursWorked - 48);
       
        double regularPay = regularHours * basePay;
        
        double overtimePay = overtimeHours * (basePay * 2);
      
        double totalPay = regularPay + overtimePay;
     
        System.out.println("Total Weekly Pay: UGX " + totalPay);
    }

    // Main method to test output functions
    public static void main(String[] args) {
       
        calculateWeeklyPay(35000, 50);  // Normal case
        calculateWeeklyPay(25000, 40);  // Error: Base pay below UGX 30,000
        calculateWeeklyPay(40000, 75);  // Error: Hours worked above 72
        calculateWeeklyPay(45000, 48);  // Regular case with no overtime
    }
}




    