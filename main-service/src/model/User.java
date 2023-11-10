package model;

import java.util.List;

public class User {

    private int id;
    private List<Passenger> passangers;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(int id, List<Passenger> passangers, String userName, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.passangers = passangers;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passenger> getPassangers() {
        return passangers;
    }

    public void setPassangers(List<Passenger> passangers) {
        this.passangers = passangers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
