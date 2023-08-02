package OOPHomework4;

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
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName) &&
                    student.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }
    }

    public void createStudent(User user) {
        studentsGroup.createStudent(user);
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
