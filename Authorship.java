import java.io.*;
import java.util.*;

public class Authorship 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter largest Length of words: ");
        int largestLength = input.nextInt();
        System.out.print("Enter File Name: ");
        String name = input.next();
        Scanner sc = new Scanner(new File(name));
        int [] count = new int [largestLength];
        double total = 0;
        
        while(sc.hasNext())
        {
            String temp = sc.next();
            if( temp.length() >= largestLength) 
            {
                count[largestLength - 1] = count[largestLength-1] + 1;
            } else {
                count[temp.length() - 1] ++;
                total++;
            }
        }
        
        System.out.println("Name of input file: " + name);
        
        for(int i = 1; i <= count.length; i ++) 
        {
            System.out.print("\tProportion of " + i + "-letter words: ");
            System.out.printf("%.2f", count[i - 1]/total * 100);
            System.out.println("%  (" + count[i - 1] + "words)");
        }
    }
}
    
