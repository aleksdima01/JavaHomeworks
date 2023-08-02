package OOPHomework4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(13, "Петров", "Иван", "Иванович");
        Student student3 = new Student(11, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(21, "Болконская", "Иван", "Иванович");
        Student student5 = new Student(14, "Романов", "Сергей", "Иванович");
        Student student6 = new Student(22, "Ромашов", "Иван", "Иванович");
        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);
        studentsGroup.addStudent(student5);
        studentsGroup.addStudent(student6);
        StudentsGroupService studentsGroupService = new StudentsGroupService();
        studentsGroupService.setStudentsGroup(studentsGroup);
        System.out.println(studentsGroup);
        studentsGroupService.removeStudentByFIO("Романов", "Сергей", "Иванович");
        System.out.println(studentsGroup);
        Teacher teacher1 = new Teacher("Иванов", "Сергей", "Петрович");
        TeacherService teacherService = new TeacherService();
        TeacherController teacherController = new TeacherController();
        teacherController.create(teacher1);
        teacherController.getAllTeachers();
        teacherController.editTeacher("Иванов", "Сергей", "Петрович", "Русский язык");
        teacherController.getAllTeachers();
    }

}
