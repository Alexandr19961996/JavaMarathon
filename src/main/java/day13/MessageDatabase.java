package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message value : messages) {
            if ((value.getSender() == u1 && value.getReceiver() == u2) || (value.getSender() == u2 && value.getReceiver() == u1)) {
                System.out.println(value.getSender() + ": " + value.getText());
            }
        }
    }
}
