package mileage;
import java.util.Scanner; //Importing scanner class
/**
 * CMPSC 221 - 002A
 * Mileage Calculator
 * @author Gabe Nulman
 */
public class Mileage {
    
    public static void main(String[] args) {
        //Declaring double variables to hold values for IPO
        double milesDriven;
        double gallonsUsed;
        double mpg;
        
        //Input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Gabe's Mileage Calculator"); //Print a line indicating this program will calculate mileage
        System.out.print("Enter the amount of miles that you drove: ");
        milesDriven = keyboard.nextDouble();
        System.out.print("Enter the amount of gallons of gas used: ");
        gallonsUsed = keyboard.nextDouble();
        
        //Process
        mpg = milesDriven / gallonsUsed;
             
        //Output
        System.out.println("Your vehicle gets " + mpg + " Miles Per Gallon.");
        
    }
    
}
