package ExceptionHomework3;

import java.util.ArrayList;

public class ListUsers {
    private ArrayList<User> allUsers = new ArrayList<>();


    public ArrayList<User> getUsers() {
        return allUsers;
    }

    public void addUser(User user) {
        allUsers.add(user);
    }

    @Override
    public String toString() {
        return "ListUsers=" +
                allUsers;
    }
}

