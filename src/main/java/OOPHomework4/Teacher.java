package OOPHomework4;

public class Teacher extends User {
    private String lesson;

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    public Teacher(String firstName, String secondName, String lastName, String lesson) {
        super(firstName, secondName, lastName);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
