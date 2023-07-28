package OOPHomework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Stream implements Iterable<StudentsGroup>, Comparable<Stream> {
    private List<StudentsGroup> streamStudents;


    public Stream(List<StudentsGroup> streamST) {
        this.streamStudents = streamST;
    }


    @Override
    public String toString() {
        return "Stream{" +
                "StreamStudents=" + streamStudents +
                '}' + "\t";
    }

//    @Override
//    public StudentsGroupIterator iterator() {
//        for (StudentsGroup studentsGroups : streamStudents) {
//            return new StudentsGroupIterator(studentsGroups);
//        }
//        return null;
//    }

    public void addGroup(StudentsGroup studentsGroup) {
        if (studentsGroup != null) {
            this.streamStudents.add(studentsGroup);
        }
    }

    public Integer getCountGroups() {
        int size = streamStudents.size();
        return size;
    }

    @Override
    public int compareTo(Stream o) {
        Integer size = streamStudents.size();
        return size.compareTo(o.getCountGroups());
    }

    @Override
    public Iterator<StudentsGroup> iterator() {
        return new StreamIterator(streamStudents);
    }

}
