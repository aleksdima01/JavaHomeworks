package OOPHomework6;

public interface UserController<T extends User> {  //Применен ISP принцип
    void create(String firstName, String secondName, String lastName);

}
