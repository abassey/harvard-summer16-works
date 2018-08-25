import java.util.Scanner;

public class Roman {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your Roman Numeral? ");
        String rom = keyboard.next();
        System.out.print("The arabic (integer) equivalent is: ");
        System.out.print(romanConvert(rom));
    }
    
    public static int romanConvert(String s) {
       
        
        
        int answer = 0;
        
       
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'M'){
               answer += 1000;
               continue;
            } 
            if (s.charAt(i) == 'D'){
               answer += 500;
               continue;
            } 
            if (s.charAt(i) == 'C'){
               answer += 100;
               continue;
            } 
            if (s.charAt(i) == 'L'){
               answer += 50;
               continue;
            } 
            if (s.charAt(i) == 'X'){
               answer += 10;
               continue;
            } 
            if (s.charAt(i) == 'V'){
               answer += 5;
               continue;
            } 
            if (s.charAt(i) == 'I'){
               answer += 1;
               continue;
            } 
            
        
        }
        
        return answer;
    }
    
}