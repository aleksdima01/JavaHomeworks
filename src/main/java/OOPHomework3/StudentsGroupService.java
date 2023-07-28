package OOPHomework3;

import java.util.Iterator;


public class StudentsGroupService {
    private StudentsGroup studentsGroup;

    public StudentsGroupService(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public StudentsGroupService() {
        this.studentsGroup = new StudentsGroup();
    }

    public void removeStudentByFIO(String firstName, String secondName, String lastName) {
        Iterator<Student> iterator = studentsGroup.iterator();
        boolean set = false;
        if (!iterator.hasNext()) {
            System.out.println("В группе всего 1 студент. Удаление невозможно!");
            set = true;
        }
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName) &&
                    student.getLastName().equals(lastName)) {
                iterator.remove();
                set = true;
                System.out.println("Студент успешно удален из группы!");
            }

        }
        if (set == false) {
            System.out.println("Удаление студента из группы: Таких студентов нет в группе!");
        }
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
