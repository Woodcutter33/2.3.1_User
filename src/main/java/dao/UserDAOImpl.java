package dao;

import models.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {


    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void editUser(int id) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
