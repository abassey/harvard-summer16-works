import java.util.Scanner;

public class Congress 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age? ");
        int a = keyboard.nextInt();
        System.out.println("What number of years have you been a US Citizen? ");
        int c = keyboard.nextInt();
        
        System.out.println(candidate(eligibleForSenate(a,c), eligibleForHouse(a,c)));
    }
    public static boolean eligibleForSenate(int age, int lengthOfCitizenship)
    {
        return (age >= 25 && lengthOfCitizenship >= 7 ? true : false);
    }
    public static boolean eligibleForHouse(int age, int lengthOfCitizenship)
    {
        return (age >= 30 && lengthOfCitizenship >= 9 ? true : false);
    }
    public static String candidate(boolean x, boolean y)
    {
        if (x == true && y == true){
            return ("You are eligible for both House and Senate");
        } else if (!(x == true) && !(y == true)){
            return ("You are eligible for neither House nor Senate");
        } else if (x == true && !(y == true)){
            return ("You are eligible for House, but not Senate");
        } else {
            return ("Try again");
        }
    }
    
}