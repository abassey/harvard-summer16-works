public class PowersOf2
{
    public static void main(String[] args)
    {
        printPowersOf2(32);
    }
    public static void printPowersOf2(long y)
    {
        long newX = 1;
        long x = 2;
        for (long i = 0; i <= y; i++)
        {
              System.out.print(newX + " ");
              newX = newX * x;
        }
    }
              
}