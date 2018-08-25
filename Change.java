import java.util.Scanner;
public class Change {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        final int DAYS = 5;
        System.out.print("Enter first stock price:  ");
        int max = myScanner.nextInt();
        int min = max;
        for (int i = 1; i < DAYS; i++)
        {
           
            System.out.print("Next price: ");
            int x = myScanner.nextInt();
            if (x > max)
            {
                max = x;
              
            } else if (x < min) {
                min = x;
            }
         
        }
         int w = Math.abs(max - min);
   
        System.out.println("Largest change of: " + w + " from " + max + " to " + min);
        

    }
}