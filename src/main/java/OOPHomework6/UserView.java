package OOPHomework6;

import java.util.List;

public interface UserView<T extends User> {  //Применен ISP принцип
    void sendOnConsole(List<T> listT);

}
