package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
        else countPlayers = 6;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
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
    public static void info(){
        if (countPlayers < 6) System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
