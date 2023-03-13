package CarlysEventPrice;
import java.util.*;
/**
 * CMPSC 221 First Hands-On Assignment:
 * Carly’s Catering provides meals for parties and special events. 
 * Write a program that prompts the user for the number of guests attending an event and then computes the total price, which is $35 per person. 
 * Display the company motto with your desired border, and then display the number of guests, price per guest, and total price. 
 * Also display a message that indicates true or false depending on whether the job is classified as a large event—an event with 50 or more guests. 
 * Save the file as CarlysEventPrice.java.
 * @author Gabe Nulman
 */
public class CarlysEventPrice {
    
    public static void main(String[] args) {
        int price = 35;
        int totalPrice;
        
        System.out.println("Welcome to Carly's Catering, where serving you, is our number one priority!");
        
        System.out.print("Enter the number of guests attending the event: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        try {
            int numGuests = Integer.parseInt(userInput);
            if (numGuests < 0) {
                System.out.println("Invalid guest input"); }
            
            totalPrice = numGuests * price;
            System.out.println("Number of guests: " + userInput);
            System.out.println("Price per guest: $" + price);
            System.out.println("Total price: $" + totalPrice);
            
            if (numGuests >= 0 && numGuests < 50) {
                System.out.println("Large Event (50 or more guests): False"); }
            else if (numGuests >= 50) {
                System.out.println("Large Event (50 or more guests): True"); }
        } catch (Exception exception) {
            System.out.println("Enter a valid number for the number of guests");
        }  
    }
    
}
