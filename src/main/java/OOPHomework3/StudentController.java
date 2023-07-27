package OOPHomework3;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    // private StudentsGroupService studentsGroupService;
    public static void main(String[] args) {
        Student student1 = new Student(12, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(13, "Петров", "Иван", "Иванович");
        Student student3 = new Student(11, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(21, "Болконская", "Иван", "Иванович");
        Student student5 = new Student(14, "Романов", "Сергей", "Иванович");
        Student student6 = new Student(22, "Ромашов", "Иван", "Иванович");
        Student student7 = new Student(29, "Комаров", "Иван", "Алексеевич");
        Student student8 = new Student(19, "Федоров", "Сергей", "Иванович");
        Student student9 = new Student(27, "Петренко", "Иван", "Иванович");
        StudentsGroup studentsGroup1 = new StudentsGroup();
        StudentsGroup studentsGroup2 = new StudentsGroup();
        StudentsGroup studentsGroup3 = new StudentsGroup();
        StudentsGroup studentsGroup4 = new StudentsGroup();
        StudentsGroup studentsGroup5 = new StudentsGroup();
        studentsGroup1.addStudent(student1);
        studentsGroup1.addStudent(student2);
        studentsGroup2.addStudent(student5);
        studentsGroup3.addStudent(student4);
        studentsGroup4.addStudent(student3);
        studentsGroup5.addStudent(student6);
        studentsGroup5.addStudent(student7);
        studentsGroup4.addStudent(student8);
        studentsGroup3.addStudent(student9);
        StudentsGroupService studentsGroupService = new StudentsGroupService();
        //  studentsGroupService.setStudentsGroup(studentsGroup1);
        // System.out.println(studentsGroup1);
        //studentsGroupService.removeStudentByFIO("Романов", "Сергей", "Иванович");
        System.out.println(studentsGroup1);
        List<StudentsGroup> streamList1 = new ArrayList<>();
        List<StudentsGroup> streamList2 = new ArrayList<>();
        streamList1.add(studentsGroup1);
        streamList1.add(studentsGroup2);
        streamList2.add(studentsGroup3);
        streamList2.add(studentsGroup4);
        streamList2.add(studentsGroup5);
        Stream stream1 = new Stream(streamList1);
        Stream stream2 = new Stream(streamList2);
        System.out.println(stream1);
        System.out.println(stream2);
        //  stream1.addGroup(studentsGroup3);
        // System.out.println(stream1);
        // System.out.println(stream1.iterator());
        System.out.println(stream1.getCountGroups());
        System.out.println(stream2.getCountGroups());
        //   System.out.println(stream1.compareTo(stream2));
        StreamComparator comparator = new StreamComparator();
        comparator.compare(stream1, stream2);
    }
}
