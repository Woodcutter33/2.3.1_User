package Service;

import dao.UserDAO;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public Object editUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
