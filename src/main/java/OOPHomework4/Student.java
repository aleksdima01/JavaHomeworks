package OOPHomework4;

public class Student extends User implements Comparable<Student> {
    private Integer numberOfStudent;


    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.numberOfStudent = numberOfStudent;
    }


    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        Student student = (Student) o;
//        return (this.firstName.equals(student.firstName)
//                && this.secondName.equals(student.secondName)
//                && this.lastName.equals(student.lastName));
//
//    }

    @Override
    public String toString() {
        return "Student{" +
                "Номер зачетки=" + numberOfStudent +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.numberOfStudent.compareTo(o.numberOfStudent);
    }


}

