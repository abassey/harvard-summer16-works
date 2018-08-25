public class PrintRange {
    public static void main(String[] args)
    {
        printRange(2,7);
    }
    public static void printRange(int x, int y)
    {
        System.out.print("[");
       
        if (x < y) 
        {
            for (int z = x; z <= y; z++)
         {
                System.out.print( z  + " " );
         }
        } else if (x > y) { 
                for (int z = x; z >= y; z--)
            {
                 System.out.print( z  + " " );
            }
        } else {
                System.out.print(x);
        }
        
         System.out.print("]");
         System.out.println();
    }
}