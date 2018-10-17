
import java.lang.Math;
/**
 * Calculator.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * This class will take in two doubleegers (or doubles if you prefer) and will
 * provide methods to perform various operations
 *
 */
public class Calculator
{
    //Instance variable(s) ????
    private double num1;
    private double num2;
    public static double getSum(double num1, double num2){
        return num1 + num2;
    }
    /**
     * Constructs an instance of the Calculator class
     */
    public Calculator(double x, double y){
     num1 = x;
     num2 = y;
    }
    /**
     * Calculates and returns the sum of the two numbers
     */
    public double addNumber(){
     return num1+num2;   
    }
    /**
     * Calculates and returns the difference of the two numbers
     */
    public double subtractNumber(){
     return num1-num2;   
    }
    /**
     * Calculates and returns the product of the two numbers
     */
    public double mutiplyNumbers(){
     return num1*num2;   
    }
    /**
     * Calculates and returns the average of the two numbers. BE CAREFUL
     */
    public double divideNumbers(){
     return num1+num2/2.0; 
    }
    /**
     * Calculates and returns the distance between (absolute value) the two numbers
     * (Use the Math class)
     */
    public double findDistance(){
        return Math.abs(num1-num2);
    }
    /**
     * Calculates and returns the maximum of the two numbers (Use the Math class)
     */
    public double findMax(){
        return Math.max(num1,num2);
    }
    /**
     * Calculates and returns the minimum of the two numbers (Use the Math class)
     */
    public double findMin(){
        return Math.min(num1,num2);
    }
    /**
     * Performs your favorite mathematical operation using one or both numbers
     */
    public double findVolumeSphere(){
     return 4*Math.PI*((5^3)/3);  
    }
    /**
     * Returns a String representation of the answers to all of the operations 
     */
    public String toSting() {
        return "Add: "+num1+"+"+num2+"="+addNumber()+"\nSubtract: "+num1+"-"+num2+"="+subtractNumber()+"\nMutiply: "
               +num1+"*"+num2+"="+mutiplyNumbers()+"\nAverage: "+num1+"+"+num2+"/2" +"="+findDistance()+ "\nMax: "+
               num1+","+num2 +"="+findMax()+ "\nMin: "+ num1+","+num2 +"="+findMin()+ "\nVolumeOfSphere: 4*Math.PI*((5^3)/3); ="+findVolumeSphere(); 
    }
  
}
               
    

