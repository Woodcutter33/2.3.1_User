package dao;

import models.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUser();

    void createUser(User user);

    User getUser(int id);

    void editUser(int id);

    void deleteUser(int id);




}
