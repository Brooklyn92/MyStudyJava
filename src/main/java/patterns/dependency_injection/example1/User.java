package patterns.dependency_injection.example1;

import java.util.UUID;

public class User {
    private String userName;
    private String password;
    private String id;
    private int age;

    private String generateId() {
        return id  = String.valueOf(UUID.randomUUID());
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = generateId();
    }
    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
        this.id = generateId();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
