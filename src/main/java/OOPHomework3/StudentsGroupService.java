package OOPHomework3;

import java.util.Iterator;
import java.util.List;

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

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
