package OOPHomework6;

import java.util.Iterator;

public class RemoveStudent { //Применены принципы открытости/закрытости (OCP),единственной ответственности (SRP)
    // за счет вынесения метода из класса StudentsGroupService в отдельный класс.
    private StudentsGroup studentsGroup;

    public RemoveStudent(StudentsGroup studentsGroup) {
        this.studentsGroup = StudentsGroupService.getStudentsGroup();
    }

    public RemoveStudent() {
        this.studentsGroup = StudentsGroupService.getStudentsGroup();
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
}
