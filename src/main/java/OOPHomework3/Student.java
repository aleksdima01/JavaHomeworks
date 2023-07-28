package OOPHomework3;

public class Student implements Comparable<Student> {
    private Integer numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName) {
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Номер зачетки=" + numberOfStudent +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.numberOfStudent.compareTo(o.numberOfStudent);
    }
}

