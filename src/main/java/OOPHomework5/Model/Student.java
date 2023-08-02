package OOPHomework5.Model;

public class Student extends User {
    private Integer studentID;

    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" + super.getFirstName() + " " +
                super.getSecondName() + " " +
                super.getLastName() + ", " +
                "studentID=" + studentID +
                '}';
    }
}
