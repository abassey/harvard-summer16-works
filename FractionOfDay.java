public class FractionOfDay {
    public static void main(String[] args)
    {
        System.out.println("Time:  Fraction Since Midnight:" );
        for(int i = 0; i < 13; i ++) 
        {
            System.out.printf("%1s", (i + ":00 AM"));
            System.out.printf("%12.4f",fractionOfDay( i, 0, 0, 'a'));
            System.out.println();
        }
        
        for(int i = 0; i < 13; i ++) 
        {
            System.out.printf("%1s", (i + ":00 PM"));
            System.out.printf("%12.4f",fractionOfDay( i, 0, 0, 'p'));
            System.out.println();
        }
        
    }
    
    public static double fractionOfDay(int h, int m, int s, char q) 
    {
        s = h * 3600 + m * 60 + s;
        if( q == 'p') 
        {
            return s/86400.0 + 0.5;
        }
        return s/86400.0;
    }
}