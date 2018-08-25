import java.util.Random;

public class Drunk 
{
    public static void main(String[] args) 
    {
        int times = 5;
        double count = 0;
        for(int i = 0; i < times; i++) 
        {
            System.out.println("Here we go again... time for a walk!");
            double walks = drunkWalk();
            System.out.println("Walked " + walks + " blocks.");
            count = count + walks;
            System.out.println("");
        }
        
        System.out.println("Average # of blocks equals " + count / times);
    }
    
    public static int drunkWalk() 
    {
        int block = 6;
        int count = 0;
        Random rand = new Random();
        
        do {
            count++;
            int num = rand.nextInt(4-1) + 1;
            if(num > 2) {
                block = block + 1;
            }else{
                block = block - 1;
            }
            
        } while (block < 11 && block > 1);
        if (block == 11) {
            System.out.println("Landed in JAIL");
            
        } else {
            System.out.println("Landed at HOME");
        }
        
        return count;
    }
}

// when I used RandomUtils.randomInt(), the program kept being equals to 1 and printing out HOME. So I used the Random Class.
