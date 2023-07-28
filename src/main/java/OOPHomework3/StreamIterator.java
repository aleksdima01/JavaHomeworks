package OOPHomework3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentsGroup> {
    private List<StudentsGroup> studentsGroupList;
    private int counter1;

    public StreamIterator(List<StudentsGroup> studentsGroupList) {
        this.studentsGroupList = studentsGroupList;
        this.counter1 = 0;
    }

    @Override
    public boolean hasNext() {
        return counter1 < studentsGroupList.size() - 1;
    }

    @Override
    public StudentsGroup next() {
        if (!hasNext()) {
            return null;
        }
        counter1++;
        return studentsGroupList.get(counter1);
    }

    @Override
    public void remove() {
        studentsGroupList.remove(counter1);
    }

    @Override
    public String toString() {
        return "StreamIterator{" +
                "studentsGroupList=" + studentsGroupList +
                '}';
    }
}
