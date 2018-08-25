public class TwoRandom {
    public static void main (String[] args) {
        int roll1;
        int roll2;
            roll1 = RandomUtils.randomInt(1, 7);
            roll2 = RandomUtils.randomInt(1, 7);
            System.out.printf("You rolled a %d and a %d\n", roll1, roll2);
                if (roll1 - roll2 == 0){
                    System.out.println("A tie!");
                }else if (roll1-roll2 == 1 || roll1-roll2 == 3 || roll1-roll2 == 5) {
                    System.out.println("You lose!");
                } else if (roll1-roll2 == 2 || roll1-roll2 == 4 || roll1-roll2 == 6) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Try again");
                }
    }
}       