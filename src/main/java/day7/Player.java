package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
        else countPlayers = 6;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public int run() {
        if (stamina == MIN_STAMINA) return countPlayers;
        stamina--;
        if (stamina == MIN_STAMINA) countPlayers--;
        return countPlayers;
    }

    public static void info() {
        String oneOutput = "места";
        String twoOutput = "мест";
        String threeOutput = "местo";
        if (countPlayers < 6 && ((6 - countPlayers) == 4 || (6 - countPlayers) == 3 || (6 - countPlayers) == 2)) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных " + oneOutput);
        } else if (countPlayers < 6 && ((6 - countPlayers) == 6 || (6 - countPlayers) == 5)) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных " + twoOutput);
        } else if (countPlayers < 6 && (6 - countPlayers) == 1) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное " + threeOutput);
        } else System.out.println("На поле нет свободных мест");
    }
}
