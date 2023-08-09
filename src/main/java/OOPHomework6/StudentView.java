package OOPHomework6;

import java.util.List;

public class StudentView implements UserView<Student> {  //Применен SRP принцип
    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов:");
        for (Student student : listT) {
            System.out.println(student.getNumberOfStudent());
        }

    }
}
