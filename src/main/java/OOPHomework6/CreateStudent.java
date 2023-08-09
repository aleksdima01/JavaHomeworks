package OOPHomework6;

public class CreateStudent {  //Применены принципы открытости/закрытости (OCP),единственной ответственности (SRP)
    // за счет вынесения метода из класса StudentsGroupService в отдельный класс.
    private StudentsGroup studentsGroup;

    public CreateStudent() {

        this.studentsGroup = StudentsGroupService.getStudentsGroup();

    }

    public void createStudent(Student student) {
        studentsGroup.createStudent(student);
    }
}
