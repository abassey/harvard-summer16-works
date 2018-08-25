public class Craps
{
    public static void main(String [] args) 
    {
        int point = doRoll(); // this calls out the doRoll method, starting the first part of the game
        doRoll2(point); // once the point as been established, the second round starts with the value of the previous
    }
    
    public static int doRoll() 
    {
        int dice1; // both dices are initalized here
        int dice2;
        int total;
        do 
        {
            dice1 = RandomUtils.randomInt(1,6); // calls out the class file to roll the dice
            dice2 = RandomUtils.randomInt(1,6);
            total = dice1 + dice2;
            System.out.println("Computer rolls a " + dice1 + " and " + dice2 +",for a total of " + total + ".");
        }
        while (!(total <= 10) || !(total >= 4) || (total == 7)); // these are the conditions for the first part of the game
        
        System.out.println(total + " is now the established POINT.");
        return total; // this total is returned to the main method, where it then becomes the point
    }
    
    public static void doRoll2(int point)
    {
        int dice1; // these have to be re-intialized because their scope was only the doRoll method and could not be seen elsewhere
        int dice2;
        int total;
        do // these is repeated for the second part of the game
        {
            dice1 = RandomUtils.randomInt(1,6);
            dice2 = RandomUtils.randomInt(1,6);
            total = dice1 + dice2;
            System.out.println("Computer rolls a " + dice1 + " and " + dice2 +",for a total of " + total + ".");
        }
        while (!(total <= 10) || !(total >= 4) || (total != point) && (total != 7));
        
        if (total == 7) // this if statement then determines if you win or lose
        {
            System.out.println("YOU Lose!"); // it is easier to use only (total == 7) than listing every other condition.
        } else {                             // the other conditions are covered by the else.
            System.out.println("You Win!");
        }
    }
    
}