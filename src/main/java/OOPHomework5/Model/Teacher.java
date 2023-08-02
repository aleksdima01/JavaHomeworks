package OOPHomework5.Model;

public class Teacher extends User {
    private Integer teacherID;

    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherId;
    }

    public Integer getTeacherId() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.getFirstName() + " " +
                super.getSecondName() + " " +
                super.getLastName() + ", " +
                "teacherID=" + teacherID +
                '}';
    }
}
