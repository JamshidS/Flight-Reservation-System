package Service.Impl;

import Service.UserService;
import model.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> userList;

    public UserServiceImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        user.setPassword(hashPassword(user.getPassword()));
        userList.add(user);
    }

    @Override
    public void removeUser(int userId) {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == userId) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void updateUser(User updatedUser) {
        updatedUser.setPassword(hashPassword(updatedUser.getPassword()));
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == updatedUser.getId()) {
                userList.set(i, updatedUser);
            }
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User getUserById(int userId) {
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
            for (byte b : encodedHash) {
                hexString.append(String.format("%02x", b & 0xFF));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return password;
        }
    }
}


