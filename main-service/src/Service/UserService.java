package Service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser (User user);
    void removeUser (int userId);
    void updateUser (User updatedUser);
    List<User> getAllUsers();
    User getUserById (int userId);
}
