package OOPHomework6;

import java.util.Iterator;

public class StudentsGroupService {  //Применен SRP принцип
    private static StudentsGroup studentsGroup;

    public StudentsGroupService(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public StudentsGroupService() {
        this.studentsGroup = new StudentsGroup();
    }

    public static StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
