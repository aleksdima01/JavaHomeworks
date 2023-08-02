package OOPHomework5.Service;

import OOPHomework5.Model.Group;
import OOPHomework5.Model.Student;
import OOPHomework5.Model.Teacher;

import java.util.List;

public class GroupService {
    private Group group;

    public void createGroupService(Teacher teacher, List<Student> studentList) {
        group = new Group(teacher, studentList);
    }

    public Group getGroup() {
        return group;
    }

}
