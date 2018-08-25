public class Drawing 
{
    public static void main(String[] args)
    {
        hexagon();
        System.out.println();
        straightLine();
        System.out.println();
        hexagon();
        System.out.println();
        straightLine();
        System.out.println();
        bottom();
        System.out.println();
        top();
        straightLine();
        System.out.println();
        bottom();
        
    }
    public static void hexagon()
    {
        top();
        bottom();
    }
    public static void top()
    {
        System.out.println("     ___________");
        System.out.println("    /           \\");
        System.out.println("   /             \\");
        
    }
    public static void bottom()
    {
        System.out.println("   \\             / ");
        System.out.println("    \\           /");
        System.out.println("     -----------");
    }
    public static void straightLine()
    {
        System.out.print("    -\"");
        System.out.print("-\'");
        System.out.print("-\"");
        System.out.print("-\'");
        System.out.print("-\"");
        System.out.print("-");
        System.out.print("-\"");
        System.out.print("-");
    }
}