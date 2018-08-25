import java.util.Scanner;

public class Sentence 
{
    public static void main(String [] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String a = keyboard.nextLine();
        System.out.println("Your sentence was " + sentenceType(a) + ".");
    }
    public static String sentenceType(String s)
    {
        if (s.charAt(s.length() - 1) ==  '.') 
        {
            return ("declarative");
        } else if (s.charAt(s.length() - 1) ==  '!') {
            return ("exclamatory");
        } else if (s.charAt(s.length() - 1) ==  '?') {
            return ("interrogative");
        } else {
            return ("bad ending");
        }
    }
}