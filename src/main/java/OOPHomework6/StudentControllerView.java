package OOPHomework6;

import java.util.List;

public class StudentControllerView extends StudentController { // Применен принцип открытости/закрытости (OCP)
    // путем вынесения printConsole метода в отдельный класс
    private UserView studentsView = new StudentView();

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);

    }
}
