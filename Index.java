public class Index 
{
    public static void main(String[] args) 
    {
        System.out.println(indexOf("Barack Obama","bam"));
    }
    
    public static int indexOf(String main, String substr) 
    {
        if (main.length() == substr.length()) return -1;
        else if (main.substring(0,substr.length()).equals(substr)) return 0;
        return (1 + indexOf(main.substring(1,main.length()), substr));
        
    }
}