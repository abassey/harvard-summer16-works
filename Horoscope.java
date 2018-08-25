import java.util.Scanner;

public class Horoscope
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the number of the month were you born in?");
        int m = keyboard.nextInt();
        System.out.println("What day were you born?");
        int d = keyboard.nextInt();
        System.out.println("You are " + sign(m,d));
    }
    public static String sign(int month, int day)
    {
        if (((month == 3) && (day >= 1 && day <= 21)) || ((month == 4) && (day >= 1 && day <= 19))){
            return ("Aries");
        } else if (((month == 4) && (day >= 20 && day <= 30)) || ((month == 5) && (day >= 1 && day <= 20))){
            return ("Taurus");
        } else if (((month == 5) && (day >= 21 && day <= 30)) || ((month == 6) && (day >= 1 && day <= 20))){
            return ("Gemini");
        } else if (((month == 6) && (day >= 21 && day <= 30)) || ((month == 7) && (day >= 1 && day <= 22))){
            return ("Cancer");
        } else if (((month == 7) && (day >= 23 && day <= 31)) || ((month == 8) && (day >= 1 && day <= 22))){
            return ("Leo");
        } else if (((month == 8) && (day >= 23 && day <= 31)) || ((month == 9) && (day >= 1 && day <= 22))){
            return ("Virgo");
        } else if (((month == 9) && (day >= 23 && day <= 30)) || ((month == 10) && (day >= 1 && day <= 22))){
            return ("Libra");
        } else if (((month == 10) && (day >= 23 && day <= 31)) || ((month == 11) && (day >= 1 && day <= 21))){
            return ("Scorpio");
        } else if  (((month == 11) && (day >= 22 && day <= 30)) || ((month == 12) && (day >= 1 && day <= 21))){
            return ("Sagittarius");
        } else if (((month == 12) && (day >= 22 && day <= 31)) || ((month == 1) && (day >= 1 && day <= 19))){
            return ("Capricorn");
        } else if (((month == 1) && (day >= 20 && day <= 31)) || ((month == 2) && (day >= 1 && day <= 18))){
            return ("Aquarius");
        } else if (((month == 2) && (day >= 19 && day <= 29)) || ((month == 3) && (day >= 1 && day <= 20))){
            return ("Pisces");
        } else {
            return ("INVALID DATE");
    }
}
}