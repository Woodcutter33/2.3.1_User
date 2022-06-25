package Service;

import models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void createUser(User user);

    User getUser(int id);

    Object editUser(int id);

    void deleteUser(int id);
}
