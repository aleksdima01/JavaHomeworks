package OOPHomework6;

public class User { //Применен SRP принцип
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastNam) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastNam;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
