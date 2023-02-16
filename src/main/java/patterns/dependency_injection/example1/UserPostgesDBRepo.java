package patterns.dependency_injection.example1;

import java.util.ArrayList;
import java.util.List;

public class UserPostgesDBRepo implements UserRepo{
    @Override
    public List<User> getUser() {
        System.out.println("Используем подключение к POSTGRES и получаем пользователей");
        List<User> users = new ArrayList<>();
        users.add(new User("Пользователь из POSTGRES ДБ", 24));
        return users;
    }
}
