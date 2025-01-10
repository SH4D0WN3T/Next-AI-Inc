package com.walker.nextaiinc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W4LK3R
 */
public class ContractorA {

    // Method to calculate the total weekly pay
    public static void calculateWeeklyPay(double basePay, int hoursWorked) {
        // Check if the base pay is below UGX 30,000
        if (basePay < 30000) {
            System.out.println("Error message displayed due to base pay being below the minimum required rate");
            return;
        }

        // Check if the hours worked exceed the maximum allowed of 72 hours
        if (hoursWorked > 72) {
            System.out.println("Error message displayed due to hours worked exceeding the 72-hour limit");
            return;
        }
      
        double regularHours = Math.min(hoursWorked, 48);
        
        double overtimeHours = Math.max(0, hoursWorked - 48);
      
        double regularPay = regularHours * basePay;
       
        double overtimePay = overtimeHours * (basePay * 2);
       
        double totalPay = regularPay + overtimePay;
       
        System.out.println("Total Weekly Pay: UGX " + totalPay);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test case for Contractor A
        calculateWeeklyPay(30000, 51); 
    }
}
  

