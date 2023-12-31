package ExceptionHomework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileSave {


    public void saveFile(ListUsers user) {
        String fileName = String.format("src/main/java/ExceptionHomework3/%s", user.getUsers().get(0).getSurName());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < user.getUsers().size(); i++) {
                bufferedWriter.write(String.format("%s %s %s %s %d %c\n", user.getUsers().get(i).getSurName(), user.getUsers().get(i).getName(),
                        user.getUsers().get(i).getLastName(), user.getUsers().get(i).getBirthday(), user.getUsers().get(i).getPhoneNumber(), user.getUsers().get(i).getGender()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}