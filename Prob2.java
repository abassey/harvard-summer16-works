public class Prob2 {
     public static void main(String[  ] args) 
     {
        for(int i = args.length - 1; i >= 0; i--) 
        {
            for(int j= 0 ; j <= args[i].length( ) - 1; j++) 
            {
                System.out.print(args[i].charAt(j));
            }
            System.out.print(" "); 
        }
        System.out.println( );
    }
}