package OOPHomework3;

public class StudentController {

    // private StudentsGroupService studentsGroupService;
    public static void main(String[] args) {
        Student student1 = new Student(12, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(13, "Петров", "Иван", "Иванович");
        Student student3 = new Student(11, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(21, "Болконская", "Иван", "Иванович");
        Student student5 = new Student(14, "Романов", "Сергей", "Иванович");
        Student student6 = new Student(22, "Ромашов", "Иван", "Иванович");
        StudentsGroup studentsGroup1 = new StudentsGroup();
        StudentsGroup studentsGroup2 = new StudentsGroup();
        studentsGroup1.addStudent(student1);
        studentsGroup1.addStudent(student2);
        studentsGroup1.addStudent(student5);
        studentsGroup2.addStudent(student4);
        studentsGroup2.addStudent(student3);
        studentsGroup2.addStudent(student6);
        StudentsGroupService studentsGroupService = new StudentsGroupService();
        studentsGroupService.setStudentsGroup(studentsGroup1);
        System.out.println(studentsGroup1);
        studentsGroupService.removeStudentByFIO("Романов", "Сергей", "Иванович");
        System.out.println(studentsGroup1);
        Stream stream1 = new Stream(studentsGroup1);
        System.out.println(stream1);
    }
}
