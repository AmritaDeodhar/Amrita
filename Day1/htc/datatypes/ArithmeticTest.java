package com.htc.datatypes;

/*
 * Test Arithmetic Operations
 */
public class ArithmeticTest {     // Save as "ArithmeticTest.java"
   public static void main(String[] args) {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5;  // Declare an int variable number2 and initialize it to 5
      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
   
      // Perform arithmetic Operations
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;
  
      // Print results
      System.out.println("The sum of "+number1+" and "+number2+" is "+sum);  // Print description
      
      System.out.print("The sum of "+number1+" and "+number2+" is "+difference);  
      
      System.out.print("The quotient of "+number1+" and "+number2+" is "+quotient);   
      
      System.out.print("The quotient of "+number1+" and "+number2+" is "+remainder);  
      
   
      ++number1;  // Increment the value stored in the variable "number1" by 1
                  // Same as "number1 = number1 + 1"
      --number2;  // Decrement the value stored in the variable "number2" by 1
                  // Same as "number2 = number2 - 1"
      System.out.println("number1 after increment is " + number1);  // Print description and variable
      System.out.println("number2 after decrement is " + number2);
      quotient = number1 / number2; 
      System.out.println("The new quotient of " + number1 + " and " + number2 
            + " is " + quotient);
   }
}
