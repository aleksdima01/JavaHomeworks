package OOPHomework5.Controller;

import OOPHomework5.Model.Student;
import OOPHomework5.Model.Teacher;
import OOPHomework5.Model.Type;
import OOPHomework5.Service.DataService;
import OOPHomework5.Service.GroupService;
import OOPHomework5.View.GroupView;
import OOPHomework5.View.StudentView;
import OOPHomework5.View.TeacherView;

import java.util.List;

public class Controller {

    DataService service = new DataService();

    GroupService groupService = new GroupService();
    StudentView viewStudent = new StudentView();
    TeacherView viewTeacher = new TeacherView();

    GroupView viewGroup = new GroupView();

    public void createStudent(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createGroup(Teacher teacher, List<Student> studentList) {
        groupService.createGroupService(teacher, studentList);
    }

    public List<Student> getAllStudents() {
        List<Student> studentsList = service.getStudentsAll();
        return studentsList;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachersList = service.getTeachersAll();
        return teachersList;
    }

    public void getAllStudentsOnConsole() {
        List<Student> studentsList = service.getStudentsAll();
        for (Student student : studentsList) {
            viewStudent.printStudentOnConsole(student);
        }
    }

    public void getAllTeachersOnConsole() {
        List<Teacher> userList = service.getTeachersAll();
        for (Teacher teacher : userList) {
            viewTeacher.printTeacherOnConsole(teacher);
        }
    }

    public Teacher getTeachersOnID(Integer id) {
        List<Teacher> userList = service.getTeachersAll();
        for (Teacher teacher : userList) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        throw new RuntimeException("Такого преподавателя нет!");
    }

    public void getGroupOnConsole() {
        viewGroup.printGroupOnConsole(groupService.getGroup());
    }

}
