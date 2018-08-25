import java.util.Arrays;

public class Stretching {
    
    public static void main(String[] args)  
    {
        int[] list = {18, 7, 4, 14, 11};
        int[] list2 = stretch(list);
        System.out.println(Arrays.toString(list));   
        System.out.println(Arrays.toString(list2)); 

    }

    public static int[] stretch(int[] list) 
    {
      
        int[] stretched = new int[list.length * 2];
        for (int i = 0; i < list.length; i++) 
            
            {
            stretched [i * 2] = list[i] / 2 + list[i] % 2;
            stretched [(i * 2) + 1] = list[i] / 2;
            }
        
        return stretched;
       
    }
}