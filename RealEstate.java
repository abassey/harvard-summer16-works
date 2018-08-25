import java.util.Scanner;
public class RealEstate {
    public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your sales description here: ");
    String des = keyboard.nextLine();
    System.out.println();
    System.out.println("Your corresponding vowel-less ad is: ");
    String sans = vowelDestroyer(des);
    System.out.println(sans);
    }
    
    public static String vowelDestroyer (String x) {
        String answer = "";
        for (int i = 0; i < x.length(); i++)   
        {
            char next = x.charAt(i);
            
            if (!(next == 'a' || next == 'e' || next == 'i' || next == 'o' || next == 'u') && !(next == 'A' || next == 'E' || next == 'I' || next == 'O' || next == 'U') )   
            {
            answer += x.charAt(i);
            }
            if ((x.charAt(i) == ' ') && !(next + 1 == 'a' || next + 1 == 'e' || next + 1 == 'i' || next + 1 == 'o' || next + 1 == 'u') && !(next + 1 == 'A' || next + 1 == 'E' || next + 1 == 'I' || next + 1 == 'O' || next + 1 == 'U')) {
               for (i = 1; i < 3; i++){
                continue;
               }
            }
            
        }
        return answer;  
    }
}