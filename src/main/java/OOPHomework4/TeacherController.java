package OOPHomework4;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public void create(Teacher teacher) {
        teacherService.create(teacher);
    }

    public void editTeacher(String firstName, String secondName, String lastName, String lesson) {
        teacherService.editTeacher(firstName, secondName, lastName, lesson);
    }

    public void getAllTeachers() {
        teacherView.sendOnConsole(teacherService.getAllTeachers());
    }
}
