package OOPHomework4;

import java.util.List;

public class StudentController implements UserController {
    private UserView studentsView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        User newUser = new User(firstName, secondName, lastName);
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);

    }
}


