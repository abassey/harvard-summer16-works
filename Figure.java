public class Figure
{
    public static void main(String[] args)
    {
        drawFigure();
    }
    public static void drawFigure()
    {
        for (int line = 1; line <= 5; line++)
        {
             for (int i = 0; i < 4 * (line - 1); i ++) 
             {
               System.out.print("\\");
             }
             for (int i = 1; i < 32 - (line - 1) * 8; i ++)
             {
             System.out.print("*");
             }
             for (int i = 0; i < 4 * (line - 1); i ++)
             {
            System.out.print("/");
             }
        System.out.println();
       }
    }
}