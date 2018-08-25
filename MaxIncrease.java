import java.util.Arrays;

// Finds the max increase between any two elements in a random array
// (not necessarily adjacent)
class MaxIncrease
{

    public static void main(String[] args)
    {
        // get the size of the array from the terminal and convert it from a 
        // String to an int
        int size = Integer.parseInt(args[0]);

        // make a random array of numbers
        int[] numbers = new int[size];
        int maxRange = 1_000_000;
        for (int i = 0; i < size; i++)
        {
            numbers[i] = (int) (Math.random() * maxRange);
        }

        // Uncomment this if you want to see the array generated
        //System.out.println(Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        maxIncrease(numbers);
        long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.printf("It took %.4f seconds to find.\n", elapsedTime / 1000.0);
    }

    public static void maxIncrease(int[] a)
    {
        int index1 = -1;
        int index2 = -1;
        int maxIncrease = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if (a[j] - a[i] > maxIncrease)
                {
                    maxIncrease = a[j] - a[i];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        if (maxIncrease == 0)
        {
            System.out.println("This data didn't increase ever");
        }
        else
        {
            System.out.printf("For a random array of size %d,\n", a.length);
            System.out.printf("The max increase between any two indices ");
            System.out.printf("was %d, between indices %d and %d.\n",
                              maxIncrease, index1, index2);
        }
     }
    
}