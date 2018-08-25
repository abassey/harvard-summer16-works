import java.util.Scanner;

public class Divisors 
{
    public static void main (String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input an integer value for m: ");
        int m = keyboard.nextInt();
        System.out.print("Now input an integer value for n that is greater than or equal to " + m + ": ");
        int r = keyboard.nextInt();
        type(m,r);
    
    }
    public static void type(int w, int p)
    {
         int sum = 0;
            if (p >= w)
             { 
                for (int z = w; z <= p; z++)
                {  
                    
                    if ((p % z == 0)) {
                        
                        sum = sum + z;
                    
                    }
                    
                    int j = z;
                       
                    if (j < sum){
                        System.out.println(j + " is deficient");
                       
                    } else if(j > sum){
                      System.out.println(j + " is abundant");
                     
                    } else {
                       System.out.println(j + " is perfect");
                       
                    }
                }
            }
    } 
    
}