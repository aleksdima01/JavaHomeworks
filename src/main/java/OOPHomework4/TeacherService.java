package OOPHomework4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacher.setLesson("Математика");
        teacherList.add(teacher);
    }

    public void create(Teacher teacher) {
        teacher.setLesson("Математика");
        teacherList.add(teacher);
    }

    public void editTeacher(String firstName, String secondName, String lastName, String lesson) {
        for (Teacher teacher : teacherList) {
            if (teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName) && teacher.getLastName().equals(lastName)) {
                teacher.setLesson(lesson);
            }
        }
    }

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

}
