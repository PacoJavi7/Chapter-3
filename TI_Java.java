/**
 * TI_Java.java 
 *
 * This program will emulator a basic calculator
 * 
 * MVP: Create a Calculator object and pass in two numbers. Have the application perform 
 *      each operation on the two numbers
 *      
 * Stretch1: Use either JOptionPane or Scanner and have the user enter the 2 numbers. 
 *           Then complete the MVP as described above
 * 
 * Stretch2: Complete Stretch1 as described above but use a loop to allow the user to 
 *            perform the operations for multiple sets of numbers
 *            
 * Stretch3: Create a menu that allows the user to enter the 2 numbers and then 
 *            select the operation s/he would like to perform. Can you also make it
 *            so that the user can enter multiple sets of numbers?
 *
 */

public class TI_Java 
{
   public static void main(String[] args)
   {
       Calculator c = new Calculator(5,20);
       
       System.out.println(c.addNumber());
       
       System.out.println(c.subtractNumber());
       
       System.out.println(c.mutiplyNumbers());
       
       System.out.println(c.findDistance());
       
       System.out.println(c.findMax());
       
       System.out.println(c.findMin());
       
       System.out.println();
       
       System.out.println(c.toSting());
       
       
      
   }
}
