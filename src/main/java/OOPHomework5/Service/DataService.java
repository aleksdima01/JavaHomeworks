package OOPHomework5.Service;

import OOPHomework5.Model.Student;
import OOPHomework5.Model.Teacher;
import OOPHomework5.Model.Type;
import OOPHomework5.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();


    public User getUserID(Type type, int id) {
        User resultUser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student && ((Student) user).getStudentID() == id) {
                resultUser = user;
            }
            if (!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                resultUser = user;
            }
        }
        return resultUser;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<Student> getStudentsAll() {
        List<Student> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                resultList.add((Student) user);
            }
        }
        return resultList;
    }

    public List<Teacher> getTeachersAll() {
        List<Teacher> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                resultList.add((Teacher) user);
            }
        }
        return resultList;
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeID(type);
        if (Type.STUDENT == type) {
            Student student = new Student(id, firstName, secondName, lastName);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(id, firstName, secondName, lastName);
            userList.add(teacher);
        }
    }

    private int getFreeID(Type type) {
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itsStudent && user instanceof Student) {
                lastID = ((Student) user).getStudentID() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastID;
    }
}