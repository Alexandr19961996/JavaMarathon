package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxStamina = Player.MAX_STAMINA;
        int minStamina = 90;
        int[] playersStamina = new int[6];
        for (int i = 0; i < 6; i++) {
            playersStamina[i] = random.nextInt(maxStamina - minStamina + 1) + minStamina;
        }
        Player playerOne = new Player(playersStamina[0]);
        Player playerTwo = new Player(playersStamina[1]);
        Player playerThree = new Player(playersStamina[2]);
        Player playerFour = new Player(playersStamina[3]);
        Player playerFive = new Player(playersStamina[4]);
        Player playerSix = new Player(playersStamina[5]);
        Player.info();

        Player playerSeven = new Player(random.nextInt(maxStamina - minStamina + 1) + minStamina);
        Player.info();

        for (int i = 0; i < playersStamina[0]; i++) {
            playerOne.run();
        }
        Player.info();

        Player playerEight = new Player(random.nextInt(maxStamina - minStamina + 1) + minStamina);
        Player.info();
    }
}
