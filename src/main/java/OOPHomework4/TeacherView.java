package OOPHomework4;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> listTeacher) {
        for (Teacher teacher : listTeacher) {
            System.out.println(teacher.getFirstName() + " " + teacher.getSecondName() + " " + teacher.getLastName() + ". Предмет:" + teacher.getLesson());
        }

    }
}
