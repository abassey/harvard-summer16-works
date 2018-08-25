public class RandomUtils
{

    /**
     * Returns a random integer between a and b inclusive.
     * a must be <= b
     */
    public static int randomInt(int a, int b)
    {
        return a + (int) ((b - a + 1) * Math.random());
    }

}