package OOPHomework6;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {  //Применен ISP принцип
    private List<Student> studentsList;
    private int counter;

    public StudentsGroupIterator(StudentsGroup studentsGroup) {
        this.studentsList = studentsGroup.getStudentsList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentsList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studentsList.get(counter);
    }

    @Override
    public void remove() {
        studentsList.remove(counter);
    }
}