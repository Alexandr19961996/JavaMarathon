package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> listOfUsersSubscription;

    public User(String username) {
        this.username = username;
        this.listOfUsersSubscription = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getListOfUsersSubscription() {
        return listOfUsersSubscription;
    }

    public void subscribe(User user) {
        listOfUsersSubscription.add(user);
    }

    public boolean isSubscribed(User user) {
        return listOfUsersSubscription.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
