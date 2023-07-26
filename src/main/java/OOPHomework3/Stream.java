package OOPHomework3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentsGroup> {
    private List<StudentsGroup> StreamStudents;
    private int counter;

    public Stream(StudentsGroup streamST) {
        this.StreamStudents = streamST;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentsGroup next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public String toString() {
        return "Stream{" +
                "StreamStudents=" + StreamStudents +
                '}';
    }
}
