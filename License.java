public class License {
    public static void main (String [] args) 
    {
       for (int i = 1; i <= 20; i++){
           number();
           letter();
           System.out.println();
       }
    }
    
    public static void letter(){
         for (int i = 1; i <= 3; i++){
        int letter = RandomUtils.randomInt(65,90);
        System.out.print( (char) letter);
        }
    }
    public static void number(){
         for (int i = 1; i <= 3; i++){
        int letter = RandomUtils.randomInt(1,9);
        System.out.print(letter);
        }
        System.out.print(" ");
    }
}