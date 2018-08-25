public class Looping{
    public static void main(String[] args){
        
        methodB();
        System.out.println();
        methodC();
  
    }
    public static void methodB(){
       
        for (int j = -3; j < 17; j+=4)
        {
            System.out.println(j);
        }
    }
    public static void methodC(){
       
        int x=-7;
        while (x < 13)
        {
            System.out.println(x+=4);
        }
    }
}