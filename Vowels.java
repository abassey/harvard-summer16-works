import java.util.Arrays;
public class Vowels 
{
    public static void main (String[] args)
    {
        
        System.out.println(Arrays.toString(vowelCount("I think, therefore I am")));
    }
    
    public static int[] vowelCount(String x)
    {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        for (int z = 0; z < x.length(); z++)
        {
            if (x.charAt(z) == 'a' || x.charAt(z) == 'A')
            {
                a++;
            }
            if (x.charAt(z) == 'e' || x.charAt(z) == 'E')
            {
                e++;
            }
            
            if (x.charAt(z) == 'i' || x.charAt(z) == 'I')
            {
                i++;
            }
            if (x.charAt(z) == 'o' || x.charAt(z) == 'O')
            {
                o++;
            }
            if (x.charAt(z) == 'u' || x.charAt(z) == 'U')
            {
                u++;
            }
            
        }
        
        int[] vowels = { a, e, i, o, u};
        return vowels;
    }
}