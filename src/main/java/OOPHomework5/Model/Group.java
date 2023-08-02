package OOPHomework5.Model;

import java.util.List;

public class Group {
    Teacher teacher;
    List<Student> students;

    public Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }


    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
