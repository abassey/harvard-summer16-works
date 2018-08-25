import java.util.Scanner;

public class Donor 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of contribution: $");
        double don = keyboard.nextDouble();
        System.out.println("You are a " + donor(don));
    }
    public static String donor(double amount)
    {
        
       if (amount > 10000) {
           return ("benefactor!");
        } else if (amount >= 1000 && amount < 10000) {
            return ("patron!");
        } else if (amount >= 200 && amount < 1000){
            return ("supporter!");
        } else if (amount >= 15 && amount < 200){
            return ("friend!");
        } else {
            return ("cheapskate!");
        }
        
    }
}