public class Triangle
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 9; i++){
              
               for (int j = 0; j < i + 1; j ++)
              {
                  System.out.print(120 + i * 80 + (j * i * 2) + " ");
              }
            System.out.println();
        }
      
    }
}