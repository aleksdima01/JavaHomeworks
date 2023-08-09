package OOPHomework6;

import java.util.List;

public class StudentController implements UserController {//Применен SRP принцип

    @Override
    public void create(String firstName, String secondName, String lastName) {
        User newUser = new User(firstName, secondName, lastName);
    }


}


