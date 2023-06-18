package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        //Общее тестирование программы
        user1.subscribe(user2);
        user1.subscribe(user3);
        user2.subscribe(user1);

        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.getListOfUsersSubscription());
        System.out.println(user1.isFriend(user2) + "\n");

        //Тестирование программы согласно заданию
        user1.sendMessage(user2, "Привет, user2!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Оу, привет, user1!");
        user2.sendMessage(user1, "Все хорошо, спасибо.");
        user2.sendMessage(user1, "У тебя как дела, user1?");

        user3.sendMessage(user1, "Приветики, user1!");
        user3.sendMessage(user1, "Как твои дела?");
        user3.sendMessage(user1, "Как на работе?");

        user1.sendMessage(user3, "Здравствуй, user3!");
        user1.sendMessage(user3, "Все хорошо, спасибо :)");
        user1.sendMessage(user3, "На работе все отлично!");

        user3.sendMessage(user1, "Очень рад за тебя!");

        MessageDatabase.showDialog(user1, user3);
    }
}
